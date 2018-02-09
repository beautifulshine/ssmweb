package com.li.util;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student2 s1 = new Student2("王昭君", 18);
		Student2 s2 = new Student2("西施", 19);
		Student2 s3 = new Student2("杨玉环", 20);
		Student2 s4 = new Student2("貂蝉", 17);

		// 把元素添加到集合
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// 遍历
		for (int x = 0; x < list.size(); x++) {
			Student2 s = (Student2) list.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
