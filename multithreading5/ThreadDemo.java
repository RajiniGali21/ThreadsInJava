package com.kn.multithreading5;

public class ThreadDemo {

	public static void main(String[] args) 
	{
//		creating object of my thread
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
//		setting name of threads
		t1.setName("numbers");
		t2.setName("characters");
		
//		Starting threads
		t1.start();
		t2.start();
	}

}
