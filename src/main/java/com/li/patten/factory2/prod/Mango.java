package com.li.patten.factory2.prod;

import com.li.patten.factory2.interf.Food;

public class Mango implements Food {

    @Override
    public void eat() {
        System.out.println("我是芒果，我被吃了.");
    }

}
