package com.assign.accountService.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigUtil {

	@Autowired
	private Environment env;

	public String getDriverClassName() {
		return env.getProperty("spring.datasource.driverClassName");
	}

	public String getDBUrl() {
		return env.getProperty("spring.datasource.url");
	}
	
	public String getDBUserName() {
		return env.getProperty("spring.datasource.username");
	}
	
	public String getDBPassword() {
		return env.getProperty("spring.datasource.password");
	}
	
}
