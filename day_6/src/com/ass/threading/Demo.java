package com.ass.threading;

public class Demo {

	public static void main(String[] args) {
		
		ThreadAss th = new ThreadAss();	
		
		MyClass my = new MyClass(th);
		MyClass1 my1 = new MyClass1(th);
		
		my1.setPriority(1);
		
		
	
		my.start();
		my1.start();
		
		
		

	}

}
