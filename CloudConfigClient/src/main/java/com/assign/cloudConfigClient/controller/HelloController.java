package com.assign.cloudConfigClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assign.cloudConfigClient.util.ConfigUtil;

@RestController
@RequestMapping("/rest")
@RefreshScope
public class HelloController {

	@Autowired
	private ConfigUtil config;

	@Autowired
	private Environment environment;
	
	@GetMapping("/msg")
	public String getMessage(){

		System.out.println(environment.getProperty("spring.datasource.driverClassName"));
		return "Driver class Name : "+config.getDriverClassName();		
	}
}
