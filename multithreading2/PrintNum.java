package com.kn.multithreading2;

public class PrintNum extends Thread
{
	public void run()
	{
     for(int i=1;i<=5;i++)
       {
        System.out.println("number ="+i);	
       }
//     System.out.println();
	}
}
