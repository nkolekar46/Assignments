package com.demo.jdbc;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.day7.Employee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class c = Class.forName("com.day7.Employee");
			Method m[] = c.getDeclaredMethods();
			
			for(Method x : m)
			{
				System.out.println(x.getName());
			}
			
			Field f[] = c.getDeclaredFields();
			for(Field x:f)
			{
				System.out.println(x.getName());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
