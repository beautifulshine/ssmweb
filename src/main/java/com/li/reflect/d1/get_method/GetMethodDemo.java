package com.li.reflect.d1.get_method;

import java.lang.reflect.Method;

/**
 * Created by sifu on 2017/4/8.
 */
//获取类中的方法
class ss {
    public void sleep() {
        System.out.println("睡觉");
    }

    public void sleep(String name) {
        System.out.println(name + "睡觉");
    }
   
    public void eat(String name) {
        System.out.println(name + "睡觉");
    }
    private String sayHello(String name, int age) {
        return name + "," + age;
    }
}

public class GetMethodDemo {
    public static void main(String[] args) throws Exception {
        Class<ss> personClass = ss.class;
        //获取指定的方法
        Method sleep = personClass.getMethod("eat", String.class);
        Method sayHello = personClass.getDeclaredMethod("sayHello", String.class, int.class);
       
        System.out.println(sleep);
        System.out.println(sayHello);
        
//	    Method[] methods  = personClass.getMethods();
//	    for (Method method : methods) {
//			System.out.println(method);
//		}
    }
}
