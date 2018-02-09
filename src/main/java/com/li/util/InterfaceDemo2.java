package com.li.util;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Dog11 d = new Dog11();
		d.show();
	}
}
interface Animal11 {
	int num2 = 210;
	final int num3 = 20;
	public static final int num = 10;

	//public Animal() {}

	public abstract void show();

	//public void method() {}

	//void method();
}

class Dog11 implements Animal11 {
	
	public void show() {
	//	num2 = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
		System.out.println(Animal11.num);
		System.out.println(Animal11.num2);

	}
	

	public void show2() {
		System.out.println("showdog11");
		//num2=110;
		System.out.println(num2);
	}
}
