package com.li.util;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Student2> array = new ArrayList<Student2>();

		// 创建元素
		Student2 s1 = new Student2("马苏", 18);
		Student2 s2 = new Student2("佟丽娅", 20);
		Student2 s3 = new Student2("王大锤", 19);
		Student2 s4 = new Student2("罗三炮", 21);

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		

		for (Student2 s : array) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
