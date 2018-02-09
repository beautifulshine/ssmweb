package com.li.util;

public class PersonDemo {
	public static void main(String[] args) {
		Student4 s = new Student4();
		s.show();
		s.show2();
		s.show3();
		s.show4();
	}
}
class Person3 {
	public void show() {
		System.out.println("show person");
	}	

	private void show2() {
		System.out.println("show2 person");
	}

	public void show3() {
		System.out.println("show3 person");
	}

	public  static void show4() {
		System.out.println("show4 person");
	}
}

class Student4 extends Person3 {
	public void show() {
		System.out.println("show student");
	}

	public void show2() {
		System.out.println("show2 student");
	}

	public void show3() {
		System.out.println("show3 student");
	}

	public static void show4() {
		System.out.println("show4 student");
	}
}