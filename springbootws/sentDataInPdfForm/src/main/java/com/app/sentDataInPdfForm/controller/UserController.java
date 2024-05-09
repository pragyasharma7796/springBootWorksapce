package com.app.sentDataInPdfForm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.sentDataInPdfForm.config.ResponseExport;
import com.app.sentDataInPdfForm.dto.User;
import com.lowagie.text.DocumentException;

@RestController
public class UserController {
	@Autowired
	ResponseExport export;
	@GetMapping("user/info/data")
	public void UserInfoPdf(HttpServletResponse response) throws DocumentException, IOException {
		List<User> lu = new ArrayList<User>();
		lu.add(new User(1,"Arun",70000.0));
		lu.add(new User(2,"Vibhu",70400.0));
		lu.add(new User(3,"Pragya",60000.0));
		lu.add(new User(4,"Arun",70000.0));
		lu.add(new User(5,"Varun",70000.0));
		export.export(response, lu);
	}
}
