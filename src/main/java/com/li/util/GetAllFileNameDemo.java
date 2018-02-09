package com.li.util;

import java.io.File;

public class GetAllFileNameDemo {
	public static int count1 = 0;
	public static int count2 = 0;

	public static void main(String[] args) {
		// 封装指定目录
		File srcFolder = new File("D:\\aa");
		// 递归实现
		getAllJavaFilePath(srcFolder);
		System.out.println("共学习了" + count1 + "个java文件");
		System.out.println("共学习了" + count2 + "个avi文件");
	}

	public static void getAllJavaFilePath(File srcFolder) {
		// 获取指定目录下的所有文件或者文件夹的File数组
		File[] fileArray = srcFolder.listFiles();
		// 遍历该File数组，获取得到每一个File对象
		for (File file : fileArray) {
			if (file.isDirectory()) {
				// 是文件夹：回到B(递归)
				getAllJavaFilePath(file);
			} else {
				// 判断是否以指定的后缀结尾
				if (file.getName().endsWith(".txt")) {
					count1++;
					// 就输出该文件的绝对路径
					System.out.println(file.getAbsolutePath());
				}else if(file.getName().endsWith(".jpg")){
					count2++;
					System.out.println(file.getName());
				}
			}
		}
	}
}
