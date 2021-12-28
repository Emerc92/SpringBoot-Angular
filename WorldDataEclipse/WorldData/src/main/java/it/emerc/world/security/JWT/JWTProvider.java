package it.emerc.world.security.JWT;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import it.emerc.world.security.entities.UserAdmin;

@Component
public class JWTProvider {

	private static final Logger LOGGER = LoggerFactory.getLogger(JWTProvider.class);
	
	@Value("${jwt.secret}")
	private String secret;
	
	@Value("${jwt.expiration}")
	private int expiration;
	
	public String generateToken(Authentication auth) {
		UserAdmin userAdmin = (UserAdmin) auth.getPrincipal();
		return Jwts.builder().setSubject(userAdmin.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date(new Date().getTime() + expiration * 1000))
				.signWith(SignatureAlgorithm.HS512, secret)
				.compact();
	}
	
	public String getUserNameFromToken(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
			return true;
		}catch(MalformedJwtException e){
			LOGGER.error("Bad format Token, token={}, error={}", token, e);
		}catch(UnsupportedJwtException e){
			LOGGER.error("Not supported Token, token={}", token, e);
		}catch(ExpiredJwtException e){
			LOGGER.error("Expired Token, token={}", token, e);
		}catch(IllegalArgumentException e){
			LOGGER.error("Empty Token, token={}", token, e);
		}catch(SignatureException e){
			LOGGER.error("fail firm, token={}", token, e);
		}catch(Exception e) {
			LOGGER.error("ERROR", token, e);
		}
		return false;
	}
}
