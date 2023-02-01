package com.assign.cloudConfigClient.util;

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

}
