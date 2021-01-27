package com.ass.threading;

public class MyClass1 extends Thread{
	
	ThreadAss tha1;
	public MyClass1(ThreadAss tha1)
	{
		this.tha1 = tha1;
	}
	@Override
	public void run() {
		try {
			tha1.print(5);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
