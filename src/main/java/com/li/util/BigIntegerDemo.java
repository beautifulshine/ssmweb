package com.li.util;

import java.math.BigDecimal;

public class BigIntegerDemo {
	public static void main(String[] args) {
		// 看程序写结果
		System.out.println(new BigDecimal("1.0").subtract(new BigDecimal("0.32"))); // 0.1
		System.out.println(1.0 - 0.32); // 0.68
		System.out.println(1.015 * 100); // 101.5
		System.out.println(1.301 / 100);// 0.01301
		
		//0.5 1/2
		//0.25 1/4
		//0.125	1/8
		//0.0625 1/16
		//0.4 = 0.25 + 0.125 + ...
	}
}
