package com.li.fx.fx4.d7;



/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日21:25:16
 * Description:  通过泛型方法返回泛型类型实例
 */
public class Demo7 {

    public static void main(String args[]){
        Info<String> i1 = new Info<String>() ;
        Info<String> i2 = new Info<String>() ;
        i1.setVar("s") ;
        i2.setVar("22") ;
        add(i1,i2) ;
    }
    public static <T> void add(Info<T> i1,Info<T> i2){
        System.out.println(i1.getVar() + " " + i2.getVar()) ;
    }
}
