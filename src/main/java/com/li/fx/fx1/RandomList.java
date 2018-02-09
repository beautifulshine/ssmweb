package com.li.fx.fx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
	List<T> storage = new ArrayList<T>();
	Random random = new Random();
	public T add(T item){
		storage.add(item);
		return item;
	}
	public T randomSelect(){
		return storage.get(random.nextInt(storage.size()));
	}
	
	//测试
	public static void main(String[] args) {
		RandomList<String> randomList = new RandomList<>();
		for (String string : "java,c,c++,python,php".split(",")) {
			randomList.add(string);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(randomList.randomSelect());
			System.out.print(", ");
		}
		RandomList<Integer> randomList2 = new RandomList<>();
		randomList2.add(20);
	}
}
