package com.kn.multithreadingSynchronize;

public class Hospital 
{
String resource1 = "Doctor";
String resource2 = "Bed";

public void treatTom()
{
	try {
		synchronized (resource1) 
		{
		System.out.println("Tom is using "+resource1);
		Thread.sleep(2000);
		synchronized (resource2) 
		{
		System.out.println("Tom is using "+resource2);
		Thread.sleep(2000);
		}
		}
	}
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
	
}
public void treatJerry()
{
	try 
	{
		synchronized (resource1) 
		{
		System.out.println("Jerry is using "+resource1);
		Thread.sleep(2000);
		synchronized (resource2) 
		{
		System.out.println("Jerry is using "+resource2);
		Thread.sleep(2000);
		}
		}
	}
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
	
}

}
