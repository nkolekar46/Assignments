package com.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myXmlfile.xml");
		
		Employee e = context.getBean(Employee.class);
		/*
		e.print();
		System.out.println(e);
		System.out.println(e.hashCode());
		
		Employee e2 = context.getBean(Employee.class);
		e2.print();
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		Address a = context.getBean(Address.class);
		a.print();
		System.out.println(a);
		
		Employee e1 = context.getBean(Employee.class);
		e1.setEmpid(11);
		e1.setEname("Ram");
		e1.setSalary(20000);
		e1.print();
		System.out.println(e1);
		System.out.println(e1.hashCode());
		*/
		System.out.println(e);
		

		Employee e2 = context.getBean("emp2",Employee.class);
System.out.println(e2);
	}

}
