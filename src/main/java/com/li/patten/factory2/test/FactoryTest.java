package com.li.patten.factory2.test;

import com.li.patten.factory2.factorys.AbstractFactory;
import com.li.patten.factory2.factorys.DefaultFactory;
import com.li.patten.factory2.interf.DotAHero;
import com.li.patten.factory2.interf.Food;
import com.li.patten.factory2.interf.Vehicle;
import com.li.patten.factory2.interf.Weapon;

public class FactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new DefaultFactory();
        
        Food food = factory.createApple();
        food.eat();
        
        Vehicle vehicle = factory.createBus();
        vehicle.drive();
        
        Weapon weapon = factory.createFighter();
        weapon.shoot();
        
        DotAHero hero = factory.createMedusa();
        hero.choose();
    }
}
