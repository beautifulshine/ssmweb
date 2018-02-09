package com.li.util;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 测试功能
		list.add("hello");
		list.add("world");
		list.add("java");

		// 正向遍历
		ListIterator lit = list.listIterator();
//		 while (lit.hasNext()) {
//		 String s = (String) lit.next();
//		 System.out.println(s);
//		 }
		System.out.println("---------------");

		// 逆向遍历
		while (lit.hasPrevious()) {
			String s = (String) lit.previous();
			System.out.println(s);
		}
	}
}
