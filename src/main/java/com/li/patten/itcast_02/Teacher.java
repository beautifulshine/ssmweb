package com.li.patten.itcast_02;

public class Teacher {
	private Teacher() {
	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {
		// t1,t2,t3
		if (t == null) {
			// t1,t2,t3
			t = new Teacher();
		}
		return t;
	}
}
