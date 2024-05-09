package com.app.sendmailbysmtp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.app.sendmailbysmtp.entity.EmailDetails;

@Service
public class EmailServiceIml implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	 @Value("${spring.mail.username}")
	 private String sender;
	@Override
	public String sendSimpleMail(EmailDetails details) {
		// TODO Auto-generated method stub
		// Try block to check for exceptions
       try {
    	   System.out.println(details);
            // Creating a simple mail message
            SimpleMailMessage mailMessage = new SimpleMailMessage();
 
            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getTo());
            mailMessage.setText(details.getText());
            mailMessage.setSubject(details.getSubject());
            System.out.println(mailMessage.toString());
            // Sending the mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }
        // Catch block to handle the exceptions
        catch (Exception e) {
        	e.printStackTrace();
            return "Error while Sending Mail";
        }
		
	}

	@Override
	public String sendMailWithAttachment(EmailDetails details) {
		// TODO Auto-generated method stub
		
        return null;
	}

}
