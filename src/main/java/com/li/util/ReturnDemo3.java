package com.li.util;

public class ReturnDemo3 {
	public static void main(String[] args) {
		//PersonDemo pd = new PersonDemo();
		//Person p = pd.getPerson();
		//p.study();
		
		//链式编程
		new PersonDemo22().getPerson().study();
	}
}
interface Person22 {
	public abstract void study();
}

class PersonDemo22 {
	public Person22 getPerson() {
		return new Student22();
	}
}

class Student22 implements Person22 {
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}