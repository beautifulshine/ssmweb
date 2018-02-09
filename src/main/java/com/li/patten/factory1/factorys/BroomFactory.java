package com.li.patten.factory1.factorys;

import com.li.patten.factory1.interf.Moveable;
import com.li.patten.factory1.prod.Broom;

// 具体工厂
public class BroomFactory extends VehicleFactory {

    @Override
    public Moveable create() {
        return new Broom();
    }

}
