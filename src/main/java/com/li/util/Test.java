package com.li.util;

public class Test {
	public static void main(String[] args) {
		Demo d = new Demo();
	//	d.setX(10);
	//	d.setY(20);
		//int result = d.sum();
		int result = d.sum(10, 30);
		System.out.println(result);
	}
}
class Demo {
	private int x;
	private int y;

	public Demo() {}

	public Demo(int x,int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	//成员变量已经有x,y了。这里就没有必要在定义了
	
	public int sum(int x,int y) {
		return x + y;
	}
	

	public int sum() {
		return x + y;
	}
}