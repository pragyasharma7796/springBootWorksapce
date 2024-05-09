package JWTAuthication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import JWTAuthication.helper.JWTUtill;
import JWTAuthication.model.JWTRequest;
import JWTAuthication.model.JWTResponse;
import JWTAuthication.service.CustomUserDetailsService;

@RestController
public class JWTController {
		@Autowired
		private CustomUserDetailsService  customUserDetailService;
		@Autowired
		 private JWTUtill jwtUtill;
		@Autowired
		private AuthenticationManager authenticationManager;
	
	   @RequestMapping(value="/token", method=RequestMethod.POST)
		public ResponseEntity<?> genrateToken(@RequestBody JWTRequest jwtRequest) throws Exception{
			try {
				this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
			}catch (BadCredentialsException e) {
				throw new Exception("Bad Credential");
			}
			UserDetails userDetails = this.customUserDetailService.loadUserByUsername(jwtRequest.getUsername());
			String token  = jwtUtill.generateToken(userDetails);
			return ResponseEntity.ok(new JWTResponse(token));
		}
}
