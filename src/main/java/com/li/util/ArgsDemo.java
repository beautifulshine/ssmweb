package com.li.util;

public class ArgsDemo {
	public static void main(String[] args) {
//		System.out.println(sum());

		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println(result);

		int c = 30;
		result = sum(a, b, c);
		System.out.println(result);

		int d = 40;
		result = sum(a, b, c, d);
		System.out.println(result);

		// 需求：我要计算出求和功能，参数是2-100个，目前我也不知道多少个?调用的时候我就知道了，请你提供功能?
		// 怎么办?从2个开始，一直到100个。可以，但是太麻烦了
		// 有没有更好的方案呢?有。针对参数个数不明确的情况，java就提供了一个技术：可变参数的用法。
		result = sum(10, 20, 30, 40, 50);
		System.out.println(result);
		result = sum(10, 20, 30, 40, 50, 60, 70, 80, 90);
		System.out.println(result);
	}

	public static int sum(int... a) {
		// [I@7821f46a
		// System.out.println(a);
		int result = 0;
		for (int i : a) {
			result += i;
		}
		return result;
	}

	// public static int sum(int a, int b) {
	// return a + b;
	// }
	//
	// public static int sum(int a, int b, int c) {
	// return a + b + c;
	// }
	//
	// public static int sum(int a, int b, int c, int d) {
	// return a + b + c + d;
	// }
}
