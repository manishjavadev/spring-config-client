package com.manish.javadev;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CustomerConfigEnvironment {
	@Autowired
	Environment environment;
	public String getCustomerKeyServiceConfig1() {
		System.out.println(Arrays.deepToString(environment.getActiveProfiles()));
		return environment.getProperty("my.customer.service.key1", "test Value");
	}
	public String getCustomerKeyServiceConfig2() {
		System.out.println(Arrays.deepToString(environment.getActiveProfiles()));
		return environment.getProperty("my.customer.service.key2", "test Value");
	}

}
