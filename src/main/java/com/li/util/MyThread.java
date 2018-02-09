package com.li.util;

public class MyThread extends Thread{
	public MyThread() {
	}

	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		// System.out.println("hello");
		// 要被线程执行的代码，一般来说应该是比较耗时的
		for (int x = 0; x < 100; x++) {
			System.out.println(getName()+"hello" + x);
		}
	}
	
}


