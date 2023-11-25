package com.kn.multithreading.daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		TypingCode t = new TypingCode();
		CompilingCode c = new CompilingCode();
		SavingCode s = new SavingCode();
//		set thread as daemon thread
		c.setDaemon(true);
		s.setDaemon(true );
		
		
//		start all threads
		t.start();
		c.start();
		s.start();
	}

}
