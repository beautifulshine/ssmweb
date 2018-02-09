package com.li.util;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		// 创建三个线程对象
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		// 通过setName()方法
		tp1.setName("东方不败");
		tp2.setName("岳不群");
		tp3.setName("林平之");

		// 获取默认优先级
//		 System.out.println(tp1.getPriority());
//		 System.out.println(tp2.getPriority());
//		 System.out.println(tp3.getPriority());

		// 设置线程优先级
		// IllegalArgumentException
		 tp1.setPriority(8);

		tp1.setPriority(10);
		tp2.setPriority(1);

		// 启动线程
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
