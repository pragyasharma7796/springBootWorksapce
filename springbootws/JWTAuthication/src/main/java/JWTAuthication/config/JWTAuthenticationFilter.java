package JWTAuthication.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import JWTAuthication.helper.JWTUtill;
import JWTAuthication.service.CustomUserDetailsService;

@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter{
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	@Autowired
	private JWTUtill jwtUtill;
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String requestTokenHeader = request.getHeader("Authorization");		
		String username = null;
		String jwttoken =null;
		if(requestTokenHeader !=null && requestTokenHeader.startsWith("Bearer ")) {
			jwttoken = requestTokenHeader.substring(7);
			try {
				username = this.jwtUtill.extractUsername(jwttoken);
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(username);
			if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				
			}
			
		}
		filterChain.doFilter(request, response);
	}
	
} 
