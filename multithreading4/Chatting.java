package com.kn.multithreading4;

public class Chatting extends Thread
{

	@Override
	public void run() 
	{
		try
		{
		System.out.println("chatting started");
		Thread.sleep(2000);
		System.out.println("chit chat chit chat.....");
		Thread.sleep(2000);
		System.out.println("chatting ended");
//		Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
