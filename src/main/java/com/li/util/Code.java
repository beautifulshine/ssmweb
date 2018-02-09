package com.li.util;

public class Code {
	public static void main(String[] args) {
		//show();
	Code code =	new Code();
	Code code2 =	new Code();
	
	}
	//构造代码块
	static{
			System.out.println("AAAAA"); 
		}

		public Code() {
			System.out.println("AAAAA9"); //假如这个代码的内容比较多，并且在每个构造中都会出现
		}

		public Code(String s) {
			//System.out.println("AAAAA");
			System.out.println(s);
		}

}
