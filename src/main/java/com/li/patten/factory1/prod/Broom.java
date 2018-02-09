package com.li.patten.factory1.prod;

import com.li.patten.factory1.interf.Moveable;

// 具体产品角色
public class Broom implements Moveable {

    @Override
    public void run() {
        System.out.println("我是Broom.");
    }

}
