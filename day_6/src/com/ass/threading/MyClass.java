package com.ass.threading;

public class MyClass extends Thread{

	ThreadAss tha;
	public MyClass(ThreadAss tha)
	{
		this.tha = tha;
	}
	
	@Override
	public void run() {
		
		tha.print(2);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
