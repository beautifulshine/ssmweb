package com.li.reflect.d5;

public class User 
{  
	public int count = 0;
	private int age;
	private String name;
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void reflect1()
	{
		System.out.println("Java 反射机制——调用User类中的reflect1()方法");
	}
	public void reflect2(int age, String name)
	{
		System.out.println("Java 反射机制——调用User类中的reflect2()方法");
		System.out.println("Name—> " + name + " Age—> " + age);
	}
}
