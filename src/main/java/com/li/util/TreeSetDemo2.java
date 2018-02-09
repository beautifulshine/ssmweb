package com.li.util;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		// 20,18,23,22,17,24,19,18,24
		// 构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
		TreeSet<Integer> ts = new TreeSet<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		/*// 存储元素
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);
		
         System.out.println(ts);
		// 遍历集合
		for (Integer i : ts) {
			System.out.println(i);
		}*/
		linkedList.add(20);
		linkedList.add(18);
		linkedList.add(23);
		linkedList.add(22);
		linkedList.add(17);
		linkedList.add(24);
		linkedList.add(19);
		linkedList.add(18);
		linkedList.add(24);
		TreeSet<LinkedList<Integer>> ts2 = new TreeSet<LinkedList<Integer>>();
		linkedList.add(20);
		linkedList.add(18);
		linkedList.add(23);
		linkedList.add(22);
		linkedList.add(17);
		linkedList.add(24);
		linkedList.add(19);
		linkedList.add(18);
		linkedList.add(24);
		ts2.add(linkedList);
		System.out.println(ts2);
		
	}
}
