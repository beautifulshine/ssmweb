package com.li.fx.fx4.d4;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日21:02:01
 * Description:
 */
public class Demo4 {

    public static void main(String[]args){
        Infos<String> infos=null;
        infos=new InfosImpl<>("s");

        System.out.print("s" +infos.getvar());
    }
}
