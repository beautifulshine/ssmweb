package com.li.fx.fx3;

public class FangXingMethodMain {
	
	//泛型方法：
	public <T> void show(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		FangXingMethodMain fxm = new FangXingMethodMain();
		fxm.show(100);
		fxm.show("shshh");
		fxm.show(true);
	}
}

