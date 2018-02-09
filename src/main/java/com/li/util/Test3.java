package com.li.util;

public class Test3 {
	public static void main(String[] args) {
		Zi2 z = new Zi2();  
		z.show();
		z.method();
		//z.haha();
	}
}
class Fu2{
	public int num = 10;
	public Fu2(){
		System.out.println("fu");
	}
	public void show() {
		System.out.println("show fu");
	}
}
class Zi2 extends Fu2{
	public int num = 20;
	public Zi2(){
		System.out.println("zi");
	}
	public void method() {
		System.out.println("method zi");
	}

	public void show() {
		System.out.println("show zi");
	}
//	public void show(){
//		int num = 30;
//		System.out.println(num);
//		System.out.println(this.num);
//		System.out.println(super.num);
//	}
}
