package com.demo.threading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass my = new MyClass();
		MyClass my1 = new MyClass();
		MyClass2 my2 = new MyClass2();
		MyClass2 my3 = new MyClass2();
		
		MyClass3 my11 = new MyClass3();
		MyClass3 my12 = new MyClass3();
		
//		my.start();
//		my1.start();
//		my2.start();
//		my3.start();
		
		Thread t1 = new Thread(my11);
		Thread t2 = new Thread(my12);
		t1.start();
		t2.start();

	}

}
