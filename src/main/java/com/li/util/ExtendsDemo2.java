package com.li.util;

public class ExtendsDemo2 {
	public static void main(String[] args) {
		//创建子类对象
		Zi z = new Zi();
		System.out.println(z.getNum());
		System.out.println(z.num2);
		//z.show();
		z.show2();

		//看Fu行不行
		Fu f = new Fu();
	//	System.out.println(f.num);
		System.out.println(f.num2);
	}
	
}

class Fu {
	private int num = 100;
	public int num2 = 200;
   
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	private void show() {
		System.out.println("show");
	}

	public void show2() {
		System.out.println("show2");
	}
}

class Zi extends Fu {
}

