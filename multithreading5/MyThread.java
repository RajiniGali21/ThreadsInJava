package com.kn.multithreading5;

public class MyThread extends Thread
{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("numbers"))
		{
			printNumbers();
		}
		else
		{
			printCharacters();
		}
	}

	public void printCharacters() 
	{
		System.out.println("printing characters started");
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)i+" ");
		}
		System.out.println("printing characters are completed");
	
	}

	public void printNumbers() 
	{
		System.out.println("printing numbers started");
		for(int i=1;i<=10;i++)
		{
			System.out.print("***"+i+" ");
		}
		System.out.println("printing numbers are completed");
	}
	

}
