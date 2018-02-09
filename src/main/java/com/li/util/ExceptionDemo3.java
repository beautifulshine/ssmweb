package com.li.util;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		// try {
		// method();
		// } catch (ArithmeticException e) {
		// System.out.println("除数不能为0");
		// }
		method();

		System.out.println("haha");
	}

	public static void method() throws ArithmeticException {
		System.out.println("hello");

		int a = 10;
		int b = 0;
		System.out.println(a / b);

		System.out.println("world");
	}
}
