package com.li.patten.factory3.test;

import com.li.patten.factory3.factorys.AbstractFactory;
import com.li.patten.factory3.factorys.Factory1;
import com.li.patten.factory3.interf.Flyable;
import com.li.patten.factory3.interf.Moveable;
import com.li.patten.factory3.interf.Writeable;

public class FactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new Factory1();
        Flyable flyable = factory.createFlyable();
        flyable.fly(1589);
        
        Moveable moveable = factory.createMoveable();
        moveable.run(87.6);
        
        Writeable writeable = factory.createWriteable();
        writeable.write("Hello World.");
    }
}
