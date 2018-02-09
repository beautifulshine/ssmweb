package com.li.fx.fx3;

//实例化：
//实现接口：
public class  Demo<T> implements Inter<T> {
	public void show(T t) {
		// TODO 自动生成的方法存根
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		// 更具实现的参数不一样 决定调用的方法传什么参数
		Inter<String> ins = new Demo<String>();
		ins.show("hahah");

		Inter<Boolean> inb = new Demo<Boolean>();
		inb.show(true);

		Inter<Integer> ini = new Demo<Integer>();
		ini.show(123);

	}
}