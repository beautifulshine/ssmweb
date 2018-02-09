package com.li.util;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		write();
		read();
	}

	private static void read() throws IOException {
		// 创建对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// 读数据
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readInt());
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readChar());
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readUTF());
		System.out.println(raf.getFilePointer());
		System.out.println("------------------");

		// System.out.println(raf.read());
		// raf.seek(0);
		// System.out.println(raf.readInt());
		raf.seek(4);
		System.out.println(raf.readChar());

		raf.seek(1000);
		System.out.println(raf.readUTF());

		// 释放资源
		raf.close();
	}

	private static void write() throws IOException {
		// 创建对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// 写数据
		raf.writeInt(100);
		raf.writeChar('a');
		// raf.writeUTF("hello");
		raf.writeUTF("林青霞");

		raf.seek(1000);
		raf.writeUTF("哈哈");

		// 释放资源
		raf.close();
	}
}
