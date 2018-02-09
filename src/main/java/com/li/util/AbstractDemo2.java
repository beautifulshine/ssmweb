package com.li.util;

public class AbstractDemo2 {
	public static void main(String[] args) {
		Dog4 d = new Dog4();
		d.show();
	}
}
abstract class Animal5 {
	int num = 10;
	final int num2 = 20;

	//public Animal5() {}

	public void method() {
		System.out.println("method");
	}

	public abstract void function();
}

class Dog4 extends Animal5  {
	public void show() {
		//num = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
	}

	public void function() {}
}
abstract class Student6 {
	public  abstract void show2();
	public abstract void show3();
	  abstract void show();
}
