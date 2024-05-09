package PhoneOTP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PhoneOTP.dto.SMSPOJO;
import PhoneOTP.service.SMSService;

@RestController
public class SMSController {
		@Autowired
		private SMSService smsService;
		
	   @PostMapping("/lesson/mobileNo")
		public String sentOtp(@RequestBody  SMSPOJO smspojo) {
			try {
				smsService.sent(smspojo);

			}catch(Exception e) {
				e.printStackTrace();
			}
			return "Succesfully OTP ";
		}
	  	   
}
