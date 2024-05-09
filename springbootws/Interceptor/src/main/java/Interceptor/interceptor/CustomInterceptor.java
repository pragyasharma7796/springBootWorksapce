package Interceptor.interceptor;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import io.micrometer.core.instrument.util.StringUtils;



public class CustomInterceptor implements HandlerInterceptor {
   private static String USERNAME = "admin";
   private static String PASSWORD = "admin";

	//--header 'Authorization: Basic YWRtaW46YWRtaW4='
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CustomInterceptor::preHandle()");
		String authHeader = request.getHeader("Authorization");
		System.out.println(authHeader);
		String base4 =authHeader.substring("Basic ".length());
		System.out.println(base4);

		byte []decodeCred = Base64.getDecoder().decode(base4);
		System.out.println(decodeCred);
     	String creds = new String(decodeCred,StandardCharsets.UTF_8);
		System.out.println(creds);
		String [] cred = creds.split(":");
		if(USERNAME.equals(cred[0].trim()) && PASSWORD.equals(cred[1].trim())) {
			return true;
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("CustomInterceptor::postHandle()");
		
		
			}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("CustomInterceptor::afterCompletion()");

		
		
	}
	
}
