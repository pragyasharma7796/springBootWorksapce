package com.app.sendmailbysmtp.dto;

import lombok.Data;

@Data
public class SecurityDto {
	private Long userId;
	private String userName;
	private String passWord;
}
