package com.li.util;

public class AbstractDemo {
	public static void main(String[] args) {
		//Animal2 a = new Animal2(); //无法实例化

		//Dog2 d = new Dog2();  //无法实例化

		Cat2 c = new Cat2();
       c.eat();
		//多态
		Animal2 a = new Cat2();
		a.eat();
		a.sleep();
	}
}
abstract class Animal2 {
	//这个方法是有方法体的，只不过内容为空
	//public void eat() {}

	//抽象方法
	public abstract void eat();
	public abstract void sleep();
}

abstract class Dog2 extends Animal2 {
}

class Cat2 extends Animal2 {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}
}
