package PhoneOTP.service;

import java.text.ParseException;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import PhoneOTP.dto.SMSPOJO;

@Service
public class SMSService {
	private static final String ACCOUNT_SID = "AC39705e348b44c55208196ad8ec11b89a";
	 private static final String AUTH_TOKEN = "531281f8ba3d7f8b49a27749a0a38aa1";
	 private static final String FROM_NUMBER ="+16506514783";
	 public void sent(SMSPOJO smspojo) throws ParseException {
		 int min = 100000;
		 int max = 999999;
		 int number = (int)(Math.random()*(max-min+1)+min);
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		 Message message = Message.creator(new PhoneNumber(smspojo.getPhoneNumber()),new PhoneNumber(FROM_NUMBER),"OTP is"+number) .create();
		 
	 }
}

