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
				.signWith(SignatureAlgorithm.HS256, secret.getBytes())
				.compact();
	}
	
	public String getUserNameFromToken(String token) {
		return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token).getBody().getSubject();
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token);
			return true;
		}catch(MalformedJwtException e){
			LOGGER.error("Bad format Token");
		}catch(UnsupportedJwtException e){
			LOGGER.error("Not supported Token");
		}catch(ExpiredJwtException e){
			LOGGER.error("Expired Token");
		}catch(IllegalArgumentException e){
			LOGGER.error("Empty Token");
		}catch(SignatureException e){
			LOGGER.error("fail firm");
		}
		return false;
	}
}
