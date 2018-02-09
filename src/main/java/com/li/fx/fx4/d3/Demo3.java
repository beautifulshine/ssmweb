package com.li.fx.fx4.d3;



/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:  2015年12月12日20:38:38
 * Description:
 */
public class Demo3 {

    public static void main(String[]args){

        Notepad<String,Integer> t=null;
        t=new Notepad<>();

        t.setKey("ss");
        t.setValue(1);

        System.out.print("姓名；" + t.getKey()) ;
        System.out.print("，年龄；" + t.getValue()) ;
    }
}
