package com.manish.javadev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestConfigController {

	@Autowired
	private Environment environment;

	@RequestMapping(value = "/config")
	public String getCustomerKeyServiceConfig() {
			// Accessing key from GIt repos
		return environment.getProperty("my.customer.service.key1") + "\n"
				+ environment.getProperty("my.customer.service.key2");
	}
}
