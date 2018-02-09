package com.li.util;
class Student3 {
	static {
		System.out.println("AAAAA");
	}

	{
		System.out.println("BBBBB");
	}
	public Student3(int ss) {
		{
			System.out.println("CCCCC22");
		}
	}

	public Student3() {
		{
			System.out.println("CCCCC");
		}
	}

	static {
		System.out.println("DDDDD");
	}

	{
		System.out.println("EEEEE");
	}
}
public class CodeTest {
	public static void main(String[] args) {
		Student3 s = new Student3();
		Student3 ss = new Student3();
		Student3 ss2 = new Student3(2);
	}
	
}
