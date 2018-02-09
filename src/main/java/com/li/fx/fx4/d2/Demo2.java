package com.li.fx.fx4.d2;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:   2015年12月12日20:26:19
 * Description:
 */
public class Demo2 {

    public static void main(String[]args){
        //里面var的类型为String
        Point<String>p=new Point<>();
        //设置String的字符串
        p.setVar("it");
        //获取字符串的长度
        System.out.print(p.getVar().length());
    }
}
