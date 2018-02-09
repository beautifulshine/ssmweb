package com.li.util;

import java.util.ArrayList;
import java.util.Collection;

public class GenericeDemo {
	public static void main(String[] args) {
		// 泛型通配符<?>
		Collection<?> c1 = new ArrayList<Animala>();
		Collection<?> c2 = new ArrayList<Doga>();
		Collection<?> c3 = new ArrayList<Cata>();
		Collection<?> c4 = new ArrayList<Object>();
		System.out.println("--------------------");

		// ? extends E
		Collection<? extends Animala> c5 = new ArrayList<Animala>();
		Collection<? extends Animala> c6 = new ArrayList<Doga>();
		Collection<? extends Animala> c7 = new ArrayList<Cata>();
		// Collection<? extends Animal> c8 = new ArrayList<Object>();
		System.out.println("--------------------");

		// ? super E
		Collection<? super Animala> c9 = new ArrayList<Animala>();
		// Collection<? super Animal> c10 = new ArrayList<Dog>();
		// Collection<? super Animal> c11 = new ArrayList<Cat>();
		Collection<? super Animala> c12 = new ArrayList<Object>();
	}
}

class Animala {
}

class Doga extends Animala {
}

class Cata extends Animala {
}