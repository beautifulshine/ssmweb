package com.li.util;

public class ThreadPriority extends Thread{

	@Override
	public void run() {
		super.run();
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
		}
	}

}
