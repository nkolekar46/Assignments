package com.mvcDemo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	public int addition(int no1, int no2)
	{
		return no1+no2;
	}
	public int substraction(int no1, int no2)
	{
		return no1-no2;
	}
	public int multiplication(int no1, int no2)
	{
		return no1*no2;
	}
	public int devide(int no1, int no2)
	{
		return no1/no2;
	}

}
