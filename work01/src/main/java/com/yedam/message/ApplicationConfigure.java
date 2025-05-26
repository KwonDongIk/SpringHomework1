package com.yedam.message;

import org.springframework.context.annotation.Bean;

public class ApplicationConfigure {
	
	@Bean
	public MessageService messageservice() {
		return new EmailMessageServiceImpl();
	}
	@Bean
	public MyController myApplication() {
		return new MyController(messageservice());
		
	}

}
