package com.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myXmlfile.xml");
	
		
		Employee e = context.getBean(Employee.class);
		e.printEmployee();
	


	}

}
