package com.li.util;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {
	private Reader r;
	private int lineNumber;

	public int getLineNumber() {
		// return ++lineNumber;
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public MyLineNumberReader(Reader r) {
		this.r = r;
	}

	public String readLine() throws IOException {
		lineNumber++;
		
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while ((ch = r.read()) != -1) {
			if (ch == '\r') {
				continue;
			}
			if (ch == '\n') {
				return sb.toString();
			} else {
				sb.append((char) ch);
			}
		}
		// 防止数据丢失
		if (sb.length() > 0) {
			return sb.toString();
		}
		return null;

	}

	public void close() throws IOException {
		r.close();
	}
}
