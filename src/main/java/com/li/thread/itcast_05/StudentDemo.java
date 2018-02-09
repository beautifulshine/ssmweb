package com.li.thread.itcast_05;

public class StudentDemo {
	public static void main(String[] args) {
		// 创建一个学生资源
		Student s = new Student();

		// 创建线程对象
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		t1.start();
		t2.start();

		// 如果想多个的时候还依次输出，就要把if改为while，并且把唤醒改为notifyAll()
		// Thread t1 = new Thread(st);
		// Thread t2 = new Thread(st);
		// Thread t3 = new Thread(st);
		// Thread t4 = new Thread(gt);
		// Thread t5 = new Thread(gt);
		// Thread t6 = new Thread(gt);
		//
		// t1.start();
		// t2.start();
		// t3.start();
		// t4.start();
		// t5.start();
		// t6.start();
	}
}
