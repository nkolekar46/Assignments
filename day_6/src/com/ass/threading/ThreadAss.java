package com.ass.threading;

public class ThreadAss {


	public synchronized void print(int a) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
