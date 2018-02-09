package com.li.util;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * LinkedHashSet：底层数据结构是哈希表和链表。
 * 哈希表：能够保证元素的唯一性
 * 链表：能够保证元素有序
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		TreeSet<Person> ts = new TreeSet<Person>();

		// 创建人对象
		Person p1 = new Person("tangseng", 30);
		Person p2 = new Person("jiapingwa", 25);
		Person p3 = new Person("zhangyimou", 25);
		Person p4 = new Person("xijinping", 26);
		Person p5 = new Person("yanni", 27);
		Person p6 = new Person("wenzhang", 30);
		Person p7 = new Person("tianliang", 28);
		Person p8 = new Person("xijinping", 26);
		Person p9 = new Person("tianliang", 24);

		// 添加元素
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		ts.add(p6);
		ts.add(p7);
		ts.add(p8);
		ts.add(p9);

		// 遍历集合
		for (Person p : ts) {
			System.out.println(p.getName() + "---" + p.getAge());
		}

	}
}