package com.li.fx.fx4.d8;

import java.util.Arrays;
import java.util.List;

public class Demo8 {

    public static void main(String args[]){
        // 返回泛型数组
        Integer i[] = fun1(1,2,3,4,5,6) ;
        List list = Arrays.asList(i);
        System.out.println(list);
        fun2(i) ;
        System.out.println();
        String[] strings = fun1("a","aa","hello");
        fun2(strings);
    }

    // 接收可变参数
    public static <T> T[] fun1(T...arg){
        // 返回泛型数组
        return arg ;
    }
    public static <T> void fun2(T param[]){
        // 输出
        System.out.print("接收泛型数组：") ;
        for(T t:param){
            System.out.print(t + "、") ;
        }
    }
}
