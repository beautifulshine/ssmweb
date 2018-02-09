package com.li.patten.factory1.factorys;

import com.li.patten.factory1.interf.Moveable;
import com.li.patten.factory1.prod.Plane;

// 具体工厂
public class PlaneFactory extends VehicleFactory {

    @Override
    public Moveable create() {
        return new Plane();
    }

}
