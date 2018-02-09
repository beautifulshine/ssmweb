package com.li.util;

import org.omg.CORBA.PUBLIC_MEMBER;

public class VariableDemo {
//成员变量
	int x;
	double z;

	public static void main(String[] args) {
//		//局部变量
//		int y;
//		//System.out.println(y);
//
//		VariableDemo vd = new VariableDemo();
//		System.out.println(vd.x);
//		System.out.println(vd.z);
		System.out.println(test());
	}
		
		public static int test(){
			int count = 5;
			try {//7
			return ++count;
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				return ++count;
			}
		
		
	}
	
}