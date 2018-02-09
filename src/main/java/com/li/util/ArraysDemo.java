package com.li.util;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):返回一个受指定数组支持的固定大小的列表
 */
public class ArraysDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "world", "java");

		// list.add("haha"); // UnsupportedOperationException
		System.out.println(list);
	//	 list.remove(1);
		list.set(1, "haha");
		System.out.println(list);
		for (String s : list) {
			System.out.println(s);
		}
	}
}
