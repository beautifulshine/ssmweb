package com.li.util;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(args); //[Ljava.lang.String;@778b3fee

		for(int x=0; x<args.length; x++) {
			System.out.println(args[x]);
		}
	}
}
