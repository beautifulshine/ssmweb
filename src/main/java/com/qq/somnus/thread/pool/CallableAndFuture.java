package com.somnus.thread.pool;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableAndFuture {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		/* 创建单个线程的线程池，如果当前线程在执行任务时突然中断，则会创建一个新的线程替代它继续执行任务 */
		ExecutorService executor = Executors.newSingleThreadExecutor();

		Callable<Integer> callable = new Callable<Integer>() {
			public Integer call() {
				int sum = 0;
				for (int j = 1; j <= 10; j++) {
					try {
						TimeUnit.MILLISECONDS.sleep(new Random().nextInt(1000));// 为了测试出效果，让每次任务执行都需要一定时间
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " is looping of " + j);
					sum += j;
				}
				return sum;
			}
		};
		
		FutureTask<Integer> future = new FutureTask<Integer>(callable);

		executor.execute(future);
		
		System.out.println("你走你的，我先走一步");
		Thread.sleep(10000);//模拟业务逻辑也在做自己的事情，同时开工
		
		int result = future.get(5000, TimeUnit.MILLISECONDS); //取得结果，同时设置超时执行时间为5s
		
		System.out.println(result);
		
		executor.shutdown();// 任务执行完毕，关闭线程池
	}

}
