package com.li.util;

public class MyThreadDemo {
	public static void main(String[] args) {
		// 创建子类对象
		// MyThread mt = new MyThread();
		// mt.run();
		// mt.run();

		// MyThread mt1 = new MyThread();
		// MyThread mt2 = new MyThread();
		// mt1.run();
		// mt2.run();

//		MyThread mt1 = new MyThread();
//		MyThread mt2 = new MyThread();
//		mt1.start();
//		mt2.start();

		// IllegalThreadStateException
		// mt1.start();
		
		MyThread mt1 = new MyThread("王祖贤");
		MyThread mt2 = new MyThread("杨岗");
		mt1.start();
		mt2.start();
		System.out.println(Thread.currentThread().getName() + "AAAAAAAAAAAAAAA");
	}
}
