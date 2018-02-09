package com.li.util;

public class ThreadDaemonDemo {
	public static void main(String[] args) {
		Thread.currentThread().setName("刘备");

		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();

		td1.setName("关羽");
		td2.setName("张飞");

		// 设置守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);

		td1.start();
		td2.start();

		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}

	}
}

