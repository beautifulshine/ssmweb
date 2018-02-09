package com.li.fx.fx2;

public class ObjectFooDemo {
	public static void main(String args[]) {
        ObjectFoo strFoo = new ObjectFoo(new String("Hello Generics!"));
        ObjectFoo douFoo = new ObjectFoo(new Double(new Double("33")));
        ObjectFoo objFoo = new ObjectFoo(new Object());
        System.out.println("strFoo.getX=" + (String) strFoo.getX());
        System.out.println("douFoo.getX=" + (Double) douFoo.getX());
        System.out.println("objFoo.getX=" + objFoo.getX());
    }
}
