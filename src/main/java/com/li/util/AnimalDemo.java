package com.li.util;

public class AnimalDemo {
	public static void main(String[] args) {
		//测试Animal
		Animal a = new Animal();
		a.setName("动物");
		a.setAge(10);
		printAni(a);
		System.out.println("------------");

		Animal a2 = new Animal("动物",10);
		printAni(a2);
		System.out.println("------------");

		//测试Dog
		Dog d = new Dog();
		d.setName("大黄");
		d.setAge(5);
		printAni(d);
		System.out.println("------------");

		Dog d2 = new Dog("大黄",5);
		printAni(d2);
		System.out.println("------------");

		//练习1：测试Cat你们自己练习
		Cat c = new Cat();
		c.setName("大花猫");
		c.setAge(2);
		printAni(c);
		System.out.println("------------");

		Cat c2 = new Cat("大花猫",2);
		printAni(c2);
		System.out.println("------------");

		//通过Dog测试多态
		Animal aa = new Dog();
		aa.setName("小黄");
		aa.setAge(3);
		printAni(aa);
		System.out.println("------------");

		Animal aa2 = new Dog("小黄",3);
		printAni(aa2);
		System.out.println("------------");

		//练习2：通过Cat测试多态你们自己练习
		Animal aa3 = new Cat("小花猫",1);
		printAni(aa3);
		System.out.println("------------");

		Animal aa4 = new Cat();
		aa4.setName("小花猫");
		aa4.setAge(1);
		printAni(aa4);
	}
	public static void printAni(Animal a){
		a.eat();
		a.sleep();
		a.show();
	}
}
class Animal {
	private String name;
	private int age;

	public Animal() {}

	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println("name:"+name+",age:"+age);
	}

	public void sleep() {
		System.out.println("sleep");
	}

	public void eat() {
		System.out.println("eat");
	}
}

class Dog extends Animal {
	public Dog() {}

	public Dog(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("dog eat");
	}

	public void sleep() {
		System.out.println("dog sleep");
	}
}

class Cat extends Animal {
	public Cat() {}

	public Cat(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("cat eat");
	}

	public void sleep() {
		System.out.println("cat sleep");
	}
}