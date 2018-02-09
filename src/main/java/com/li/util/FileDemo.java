package com.li.util;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * File:文件和目录路径名的抽象表示形式
 * 理解：不代表这个文件或者目录一定存在。
 * 
 * 构造方法：
 * 		File(String pathname)：通过一个路径名创建File对象
 * 		File(String parent, String child)： 通过父路径和子路径名创建File对象
 * 		File(File parent, String child)：通过父路径File对象和子路径名创建File对象
 */
public class FileDemo {
	/*public static void main(String[] args) {
		// 创建对象
		// File(String pathname)：通过一个路径名创建File对象
		File file = new File("d:\\demo\\a.txt");

		// File(String parent, String child)： 通过父路径和子路径名创建File对象
		File file2 = new File("d:\\demo", "a.txt");

		// File(File parent, String child)：通过父路径File对象和子路径名创建File对象
		File file3 = new File("d:\\demo");
		File file4 = new File(file3, "a.txt");
		System.out.println("end");
	}*/
	
	/*public static void main(String[] args) throws IOException {
		// 创建File文件
		File file = new File("d:\\a.txt");

		// public boolean createNewFile() throws IOException
		System.out.println("createNewFile:" + file.createNewFile());

		// 创建文件夹
		File file2 = new File("d:\\demo");
		System.out.println("mkdir:" + file2.mkdir());

		// 创建多级文件夹
		// File file3 = new File("d:\\aaa\\bbb");
		// System.out.println("mkdir:" + file3.mkdir());

		File file4 = new File("d:\\aaa");
		File file5 = new File("d:\\aaa\\bbb");
		// File file5 = new File(file4,"bbb");
		System.out.println("mkdir:" + file4.mkdir());
		System.out.println("mkdir:" + file5.mkdir());
		// 这种方式虽然可以，但是比较麻烦
		// 怎么办呢,有一种更简单的方式
		File file6 = new File("d:\\ccc\\dddd\\eee\\fff");
		System.out.println("mkdirs:" + file6.mkdirs());

		// 下面这个我到底创建的是什么呢?
		File file7 = new File("d:\\aaa\\bbb\\ccc.txt");
		System.out.println("mkdir:" + file7.mkdir());
	}*/
	
	/*public static void main(String[] args) throws IOException {
		// 创建File对象
		File file = new File("a.txt");
		System.out.println("createNewFile:" + file.createNewFile());

		File file2 = new File("aaa\\bbb");
		System.out.println("mkdirs:" + file2.mkdirs());

		File file3 = new File(file2, "b.txt");
		System.out.println("createNewFile:" + file3.createNewFile());

		// 删除文件
		System.out.println("delete:" + file.delete());

		// 删除文件夹
		File file4 = new File("aaa\\bbb\\ccc");
		System.out.println("delete:" + file4.delete());

		File file5 = new File("aaa");
		System.out.println("delete:" + file5.delete());
	}*/
	
	/*public static void main(String[] args) {
		// 给定一个目录：d:\\
		File file = new File("d:\\");

		// public String[] list():返回的是给定目录下的所有文件或者文件夹的名称数组。
		String[] strArray = file.list();
		for (String str : strArray) {
			System.out.println(str);
		}
		System.out.println("-----------------");

		// public File[] listFiles():返回的是给定目录下的所有文件或者文件夹的File数组。
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			// System.out.println(f);
			System.out.println(f.getName());
		}
	}*/
	
	/*public static void main(String[] args) {
		// 封装目录
		File folder = new File("d:\\");

		// 获取该目录下所有的文件或者文件夹的File数组
		File[] fileArray = folder.listFiles();

		// 遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			// 先判断是否是文件
			if (file.isFile()) {
				// 继续判断是否以.jpg结尾
				if (file.getName().endsWith(".java")) {
					System.out.println(file.getName());
				}
			}
		}
	}*/
	public static void main(String[] args) {
		File folder = new File("d:\\");

		 //public String[] list(FilenameFilter filter)
		 //public File[] listFiles(FilenameFilter filter)

		 String[] strArray = folder.list(new FilenameFilter() {
		 @Override
		 public boolean accept(File dir, String name) {
		 // return false;
		 // return true;
		 // System.out.println(dir + "---" + name);
		 // File file = new File(dir, name);
		 // boolean flag = file.isFile();
		 // boolean flag2 = name.endsWith(".jpg");
		 // return flag && flag2;
		
		 return new File(dir, name).isFile() && name.endsWith(".jpg");
		 }
		 });
		
		 for (String str : strArray) {
		 System.out.println(str);
		 }

		// public File[] listFiles(FilenameFilter filter)
		/*File[] fileArray = folder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".jpg");
			}
		});

		for (File file : fileArray) {
			System.out.println(file.getName());
		}*/
	}
	
}
