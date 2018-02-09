package com.li.util;

public class InnerClassDemo3 {
	public static void main(String[] args) {
		//错误
		//Outer.Inner oi = new Outer().new Inner();
	
		//用private修饰
		//Outer o = new Outer();
		//o.method();

		//用static修饰后，这种写法错误
		//Outer.Inner oi = new Outer().new Inner();
		//用类名限定
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		new Outer().show2();

		//Outer.Inner.show2();
	}
}
class Outer {
   private	static int num  = 10;
	static int num2 = 20;

	public static class Inner {
		public void show() {
			System.out.println(num);
			System.out.println("show");
			//System.out.println(num);
			//System.out.println(num2);
		}

		
	}
	public static void show2() {
		System.out.println("show2");
		//System.out.println(num);
		//System.out.println(num2);
	}
}