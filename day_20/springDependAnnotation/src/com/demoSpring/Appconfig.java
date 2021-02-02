package com.demoSpring;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Appconfig {
	
	
	@Bean
	@Scope(scopeName = "prototype")
	public Employee getEmployee()
	{
		return new Employee(1, "Ram", 45000);
	}
	@Bean
	public Address getAddress()
	{
		return new Address(416007, "kolhapur");
	}

}
