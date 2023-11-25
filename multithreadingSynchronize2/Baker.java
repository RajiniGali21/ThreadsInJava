package com.kn.multithreadingSynchronize2;

public class Baker implements Runnable
{
	
	PizzaHouse ph;
	
	int num =1;
	
	
	@Override
	public void run()
	{
		while(true)
		{
		ph.bake(num++);
		}
	}
	
	
	public Baker(PizzaHouse ph)
	{
		this.ph = ph;
	}

}
