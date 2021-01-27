package com.demo;

public class factCalculate {
	
	public int factorial(int no)
	{
		if(no<=1)
			return 1;
		else
		return no*factorial(no-1);	
	}

}
