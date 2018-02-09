package com.li.patten.itcast_01;

public class SingletDemo {
	public static void main(String[] args) {
//		 Student s1 = new Student();
//		 Student s2 = new Student();
//		 System.out.println(s1 == s2);

		// Student.s = null;

		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);
	}
}
