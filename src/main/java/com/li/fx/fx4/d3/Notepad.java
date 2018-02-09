package com.li.fx.fx4.d3;
/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日20:29:48
 * Description:
 */
public class Notepad <K,V>{//指定了2个类型

    //类型1
    private K key;

    //类型2
    private V value;

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return value;
    }

    public void setKey(K key){
        this.key=key;
    }

    public void setValue(V value){
        this.value = value ;
    }

}
