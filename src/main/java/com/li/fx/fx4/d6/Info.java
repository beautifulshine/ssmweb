package com.li.fx.fx4.d6;
/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:
 * Description:
 */
public class Info <T extends Number>{ // 指定上限，只能是数字类型

    private T var;

    public T getVar(){
        return this.var;
    }

    public void setVar(T var){
        this.var=var;
    }

    public String toString(){
        return this.var.toString();
    }
}
