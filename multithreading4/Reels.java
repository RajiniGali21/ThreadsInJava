package com.kn.multithreading4;

public class Reels extends Thread
{
@Override
	public void run() 
	{
		try
		{
		System.out.println("Creating reels");
		Thread.sleep(2000);
		System.out.println("uploading reels..");
		Thread.sleep(2000);
		System.out.println("sharing reels");
//		Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}


