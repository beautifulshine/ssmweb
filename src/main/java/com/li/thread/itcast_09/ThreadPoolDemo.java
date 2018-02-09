package com.li.thread.itcast_09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		// 创建实现了Runnable接口的对象
		MyCallable my = new MyCallable();

		// 创建线程池对象
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(5);

		// 提交代码
		// Future<?> submit(Runnable task)
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);

		// 释放
		pool.shutdown();
	}
}
