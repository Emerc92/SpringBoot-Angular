package it.emerc.world.security.JWT;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


@Component
public class JWTEntryPoint implements AuthenticationEntryPoint{

	private static final Logger LOGGER = LoggerFactory.getLogger(JWTEntryPoint.class);
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse res,
			AuthenticationException authException) throws IOException, ServletException {
		LOGGER.error("fail in metod commence  ");// per prod non serve
		res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Non autorizzato");
	}

}
