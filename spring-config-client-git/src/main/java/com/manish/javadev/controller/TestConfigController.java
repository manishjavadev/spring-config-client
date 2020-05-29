package com.manish.javadev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.javadev.CustomerConfigEnvironment;

@RestController
@RequestMapping(value = "/api")
public class TestConfigController {
	@Autowired
	CustomerConfigEnvironment customerConfigEnvironment;

	@RequestMapping(value = "/config")
	public CustomerConfigEnvironment getCustomerKeyServiceConfig() {
		return customerConfigEnvironment;
	}
}
