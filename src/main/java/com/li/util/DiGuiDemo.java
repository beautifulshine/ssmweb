package com.li.util;

public class DiGuiDemo {
/*
	public void show() {
		show();
	}

	 public DiGuiDemo() {
//	/ DiGuiDemo();
	 }

	public static void main(String[] args) {
		DiGuiDemo dgd = new DiGuiDemo();
		dgd.show();
	}*/
	/*
	public static void main(String[] args) {
		// 用循环实现阶乘
		int jc = 1;
		for (int x = 1; x <= 5; x++) {
			jc *= x;
		}
		System.out.println("5的阶乘是：" + jc);

		// 用递归实现求阶乘
		System.out.println("5的阶乘是："+jc(5));
		
	}
	
	定义一个方法jc(int n),
	 *假如jc(n)表示n的阶乘，请问
	 *n-1的阶乘如何表示呢?
	 *jc(n-1)
	 *
	 *出口是1！= 1
	 
	public static int jc(int n){
		if(n==1){
			return 1;
		}else {
			return n*jc(n-1);
		}
	}*/
	
	public static void main(String[] args) {
		// 用数组做
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 1] + arr[x - 2];
		}
		System.out.println("第20个月的兔子对数是：" + arr[19]);
		
		//用变量的变化来做
		int a = 1;
		int b = 1;
		for(int x=0; x<18; x++){
			int temp = a;//以前的a
			a = b;
			b = temp + b;
		}
		System.out.println("第20个月的兔子对数是："+b);
		
		//用递归实现
		System.out.println("第20个月的兔子对数是："+fib(20));
	}
	
	/*
	 * 定义方法fib(int n)
	 * fib(n)表示是第n个月的兔子对数。
	 * 请问，n-1和n-2个月的兔子对数如何表示呢?
	 * fib(n-1),fib(n-2)
	 */
	public static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
}