package com.kn.multithreading.daemon;

public class SavingCode extends Thread
{
	@Override
	public void run() {
//		for(int i=0;i<=10;i++)
		for(;;)
		{
	
		System.out.println("Saving code");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}


}
