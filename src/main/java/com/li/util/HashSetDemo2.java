package com.li.util;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		// HashSet存储字符串元素
		HashSet<String> hs = new HashSet<String>();

		System.out.println(hs.add("hello"));
		System.out.println(hs.add("world"));
		System.out.println(hs.add("java"));
		System.out.println(hs.add("hello"));
		System.out.println(hs.add("hello2"));
		System.out.println(hs.add("hello22"));
		System.out.println(hs.add("hello222"));
		System.out.println("hs:" + hs);
	}
}
