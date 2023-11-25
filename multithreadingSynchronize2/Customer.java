package com.kn.multithreadingSynchronize2;

public class Customer implements Runnable
{
	PizzaHouse ph;
	
	@Override
	public void run()
	{
		while(true)
		{
		ph.eat();	
		}
	}
	
	public Customer(PizzaHouse ph)
	{
		this.ph = ph;
	}

}
