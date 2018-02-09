package com.li.fx.fx4.d4;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日20:55:36
 * Description:
 */
public class InfosImpl<T> implements Infos<T>{

    private T var;

    public InfosImpl(T var){
        this.setVar(var);
    }

    public  void  setVar(T var){
        this.var=var;
    }

    public T getVar(){
        return this.var;
    }
    @Override
    public T getvar() {
        return null;
    }
}
