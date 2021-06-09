package it.emerc.world.security.JWT;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import it.emerc.world.security.services.UserDetailsServiceImp;


public class JWTTokenFilter extends OncePerRequestFilter{

	private static final Logger LOGGER = LoggerFactory.getLogger(JWTTokenFilter.class);
	
	@Autowired
	JWTProvider tokenProvider;
	@Autowired
	UserDetailsServiceImp service;
	
	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain) throws ServletException, IOException {
		try {
			String token =  getToken(req);
			if(token != null && tokenProvider.validateToken(token)) {
				String username =  tokenProvider.getUserNameFromToken(token);
				UserDetails userDetails = service.loadUserByUsername(username);
				UsernamePasswordAuthenticationToken  auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		}catch(Exception e) {
			LOGGER.error("fail getting doFilter" + e.getMessage());
		}
		filterChain.doFilter(req, res);
	}

	private String getToken(HttpServletRequest request) {
		LOGGER.debug("debug request" + request);
		String header = request.getHeader("Authorization");
		if(header != null && header.startsWith("Bearer")) {
			return header.replace("Bearer ", "");
		}
		return null;
	}
}
