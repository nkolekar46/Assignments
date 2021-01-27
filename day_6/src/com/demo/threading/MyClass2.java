package com.demo.threading;

public class MyClass2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=100; i<=110; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}
