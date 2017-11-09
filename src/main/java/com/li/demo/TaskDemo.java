package com.li.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskDemo {
	@Scheduled(cron = "0 34 16 * * ?")
	public static  void doSomething() { 
	   System.out.println("每五秒钟执行一次cron");
	}
	
	/*@Scheduled(fixedDelay = 10000)
	public void doSomething2() { 
		  System.out.println("每五秒钟执行一次2fixedDelay");
	}
	
	@Scheduled(fixedRate = 10000)
	public void doSomething3() { 
		 System.out.println("每五秒钟执行一次3fixedRate");
	}*/
}
