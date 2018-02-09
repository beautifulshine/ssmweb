package com.li.fx.fx4.d2;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日20:19:50
 * Description:
 */
public class Point<T> {//这个地方的随意写标识符 他是type的简称

    private T var;//var的类型是由T指定的 由外部指定

    public  T getVar(){//返回值类型由外部决定
        return var;
    }

    public void setVar(T var){//设置的类型也是由外部决定的
        this.var=var;
    }

}
