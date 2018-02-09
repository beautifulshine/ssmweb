package com.li.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
//		Map<Integer, Person> map = new TreeMap<Integer, Person>();
//		Person person = new Person("zs", 16);
//		Person person2 = new Person("zs2", 12);
//		Person person3 = new Person("zs3", 14);
//		Person person4 = new Person("zs4", 17);
//		Person person5 = new Person("zs5", 13);
//		Person person6 = new Person("zs6", 18);
//		map.put(3, person);
//		map.put(2, person2);
//		map.put(8, person3);
//		map.put(1, person4);
//		map.put(7, person5);
//		map.put(5, person6);
	//	System.out.println(map);
		
//		Map<Integer, Person> map2= new HashMap<Integer, Person>();  
//		map2.put(3, person);
//		map2.put(2, person2);
//		map2.put(8, person3);
//		map2.put(1, person4);
//		map2.put(7, person5);
//		map2.put(5, person6);
//		TreeMap treemap2 = new TreeMap(map);  
//		System.out.println(map2);
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		  map.put("2015-06-10", 3);
//		  map.put("2015-06-09", 2);
//		  map.put("2015-06-08", 1);
//		  map.put("2015-06-11", 4);
//		  List<String> ll = new ArrayList<>(map.keySet());
//		  Collections.sort(ll);
//		  System.out.println(ll.toString());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		  map.put("2015-06-10", 3);
		  map.put("2015-06-09", 2);
		  map.put("2015-06-08", 1);
		  map.put("2015-06-11", 4);
		  List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		  Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
		      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		          return (o1.getKey()).toString().compareTo(o2.getKey());
		      }
		  });
		  System.out.println(list.toString());
	}

}
