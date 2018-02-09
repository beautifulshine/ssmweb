package com.li.util;

public class MyRunnableDemo {
	public static void main(String[] args) {
		// 创建MyRunnable的对象
		MyRunnable my = new MyRunnable();

		// 创建Thread类的对象，并把C步骤的对象作为构造参数传递
		// Thread(Runnable target)
		// Thread(Runnable target, String name)
		Thread t1 = new Thread(my, "孟非");
		Thread t2 = new Thread(my, "乐嘉");

		// 启动线程
		t1.start();
		t2.start();
	}
}
