package com.li.util;

public class DataTypeDemo3 {
	public static void main(String[] args) {
//		System.out.println('a');
//		System.out.println('a'+1);
//		System.out.println('A'+0);
//		System.out.println('0'+0);
//		System.out.println("-----------");
//
//
//		System.out.println('a'+'b');
//		System.out.println("a"+"b");
//		
//		System.out.println("hello"+'a'+1); //左边字符串，往后拼的都是字符串
//		System.out.println('a'+1+"hello");
//		System.out.println("5+5="+5+5);
//		System.out.println(5+5+"=5+5");
//		byte by = 3;
//		int i = 4;
//		byte bb = (byte)(by + i);
//		System.out.println(bb);
	//	byte b = (byte)300;
	//	System.out.println(b);
	/*	byte b1=3,b2=4,b;
		b=(byte) (b1+b2);
		b=3+4;
		System.out.println((byte)1);
		System.out.println((byte)127);
		System.out.println((byte)128);
		System.out.println((byte)129);
		System.out.println((byte)130);
		System.out.println((byte)131);*/
//		System.out.println(10/20);
//		//要想得到小数，可以乘以或者除以1.0
//		System.out.println(10*1.0/20);
//
//		//加法的用法:正号,加法,字符串连接符
//		System.out.println(+5);
//		System.out.println(1+2);
//		System.out.println("1"+"2");
//		
//		
//			//定义一个统计变量。
//			int count = 0;
//
//			//1-1000之间告诉我们了范围，用for循环可以解决
//			for(int x=1; x<=1000; x++) {
//				//判断条件
//				if(x%3==2 && x%5==2 && x%7==2) {
//					//System.out.println(x);
//					System.out.println(x);
//					count++;
//				}
//			}
//
//			System.out.println("共有"+count+"个满足条件的数据");
//		
//		int x=0;
//		
//		while( x<10) {
//			System.out.println("HelloWorld");
//			x++;
//		}
		
//		for(int x=0; x<10; x++) {
//			if(x%3==0) {
//				break;
//				//continue;
//				//return;
//			}
//			System.out.println(x);
//		}
//
//		System.out.println("over");
		//定义数组
//				int[] arr = {1,2,3};
//
//				//System.out.println(arr[3]);
//
//				arr = null; //把arr指向堆内存给去掉了，arr没有指向了。
//				arr=new int[6];
//				System.out.println(arr[0]);
		
		//定义一个数组
//				int[] arr = new int[3];
//				
//				//赋值，输出。
//				arr[0] = 11;
//				arr[1] = 22;
//				arr[2] = 33;
//				System.out.println(arr);
//				System.out.println(arr[0]);
//				System.out.println(arr[1]);
//				System.out.println(arr[2]);
//
//				//定义第二个数组
//				int[] arr2 =  arr;
//
//				arr2[1] = 100;
//
//				System.out.println(arr);
//				System.out.println(arr[0]);
//				System.out.println(arr[1]); //???
//				System.out.println(arr[2]);
//
//				System.out.println(arr2);
//				System.out.println(arr2[0]);
//				System.out.println(arr2[1]);
//				System.out.println(arr2[2]);
		
		//定义一个二维数组
			//	int[][] arr = new int[3][2];
				//表示arr这个二维数组有三个元素
				//每个元素是一个一维数组
				//每一个一维数组有2个元素
//
//				System.out.println(arr); //[[I@778b3fee
//				System.out.println(arr[0]); //[I@57125f92
//				System.out.println(arr[1]);
//				System.out.println(arr[2]);
//
//				//如何输出元素呢?
//				System.out.println(arr[0][1]);
//				System.out.println(arr[2][9]);
				
				//定义数组
				int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};

				//定义求和变量
				int sum = 0;

				//遍历二维数组
				for(int x=0; x<arr.length; x++) {
					for(int y=0; y<arr[x].length; y++) {
						//sum = sum + arr[x][y];
						sum += arr[x][y];
						System.out.println(sum);
					}
				}

				//输出结果
			//	System.out.println("sum:"+sum);
		
	}
	}

