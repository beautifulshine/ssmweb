package com.li.fx.fx5.d2;
/**
 * Created by Administrator on 2017/7/17.
 */
public class ClassTypeMain {
    public static void main(String[] args) {
        InfoImpl<Integer,Double,Integer> i = new InfoImpl<Integer,Double,Integer>(22);
        System.out.println(i.getVar()) ;
    }
}
