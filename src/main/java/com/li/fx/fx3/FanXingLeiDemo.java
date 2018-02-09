package com.li.fx.fx3;

//泛型类：
public class FanXingLeiDemo<T> {//这里是泛型，可以传任意的参数
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		FanXingLeiDemo<String> fxd = new FanXingLeiDemo<String>();
		fxd.setObj("hahaha");
		System.out.println(fxd.getObj().getClass().getName());
		FanXingLeiDemo<Integer> fxd2 = new FanXingLeiDemo<Integer>();
		fxd2.setObj(300);
		System.out.println(fxd2.getObj().getClass().getName());
	}
}

