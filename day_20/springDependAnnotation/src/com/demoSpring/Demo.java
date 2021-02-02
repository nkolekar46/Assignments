package com.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.demoSpring");
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
		
		Address a = context.getBean(Address.class);
		System.out.println(a);

	}

}
