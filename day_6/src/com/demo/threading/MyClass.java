package com.demo.threading;

public class MyClass extends Thread{
	
	@Override
	public void run() {
	
		for(int i=0; i<=10; i++)
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
