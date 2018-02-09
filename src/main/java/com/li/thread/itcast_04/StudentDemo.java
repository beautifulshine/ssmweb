package com.li.thread.itcast_04;

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
	}
}
