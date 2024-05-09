package com.app.sendmailbysmtp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.sendmailbysmtp.entity.EmailDetails;
import com.app.sendmailbysmtp.service.EmailService;

@RestController
public class EmailController {

		@Autowired
		private EmailService emailService;
		 @PostMapping("/sendMail")
		    public String
		    sendMail(@RequestBody EmailDetails details)
		    {
			 	System.out.println(details);
		        String status = emailService.sendSimpleMail(details);
		        System.out.println(status);
		        return status;
		    }
		 // Sending email with attachment
		    @PostMapping("/sendMailWithAttachment")
		    public String sendMailWithAttachment(@RequestBody EmailDetails details)
		    {
		        String status = emailService.sendMailWithAttachment(details);
		 
		        return status;
		    }
}
