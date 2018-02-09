package com.li.patten.factory3.prod;

import com.li.patten.factory3.interf.Moveable;

public class Bus implements Moveable {

    @Override
    public void run(double speed) {
        System.out.println("我是一辆公交车，我目前的时速是:" + speed + "/小时");
    }

}
