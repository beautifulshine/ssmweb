package com.li.fx.fx4.d7;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日21:38:27
 * Description:
 */
public class Info <T>{

    private T var ;

    public T getVar(){
        return this.var ;
    }

    public void setVar(T var){
        this.var = var ;
    }

    public String toString(){
        return this.var.toString() ;
    }

}
