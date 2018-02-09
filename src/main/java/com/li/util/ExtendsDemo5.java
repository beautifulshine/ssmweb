package com.li.util;

public class ExtendsDemo5 {
	public static void main(String[] args) {
		//学生类
		Student222 s = new Student222();
		s.setName("王祖贤");
		s.setAge(27);
		System.out.println(s.getName()+"---"+s.getAge());
		s.eat();
		s.sleep();
		System.out.println("--------------------------");

		Student222 s2 = new Student222("王宝强",18);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.eat();
		s2.sleep();
		System.out.println("--------------------------");


		//老师类
		Teacher t = new Teacher();
		t.setName("王祖蓝");
		t.setAge(25);
		System.out.println(t.getName()+"---"+t.getAge());
		t.eat();
		t.sleep();
	}
}
class Person {
	private String name;
	private int age;

	public Person() {}

	public Person(String name,int age) { //"王宝强",18
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

	public void eat() {
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}
}
//学生类
class Student222 extends Person  {
	public Student222(){}

	public void eat() {
		// TODO Auto-generated method stub
		
	}

	public Student222(String name,int age) {	//"王宝强",18
		super(name,age); //"王宝强",18
	}
}

//老师类
class Teacher extends Person {
}