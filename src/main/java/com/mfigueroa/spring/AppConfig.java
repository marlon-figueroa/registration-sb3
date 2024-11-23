package com.mfigueroa.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mfigueroa.security.ActiveUserStore;

@Configuration
public class AppConfig {

	@Bean
	ActiveUserStore activeUserStore() {
		return new ActiveUserStore();
	}

}