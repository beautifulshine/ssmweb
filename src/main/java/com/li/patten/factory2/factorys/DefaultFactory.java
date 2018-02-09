package com.li.patten.factory2.factorys;

import com.li.patten.factory2.interf.DotAHero;
import com.li.patten.factory2.interf.Food;
import com.li.patten.factory2.interf.Vehicle;
import com.li.patten.factory2.interf.Weapon;
import com.li.patten.factory2.prod.Apple;
import com.li.patten.factory2.prod.Banana;
import com.li.patten.factory2.prod.Bus;
import com.li.patten.factory2.prod.Car;
import com.li.patten.factory2.prod.Fighter;
import com.li.patten.factory2.prod.Mango;
import com.li.patten.factory2.prod.Medusa;
import com.li.patten.factory2.prod.Naga;
import com.li.patten.factory2.prod.Pistol;
import com.li.patten.factory2.prod.Zeus;

public class DefaultFactory extends AbstractFactory {

    @Override
    public Food createApple() {
        return new Apple();
    }
    
    @Override
    public Food createBanana() {
        return new Banana();
    }

    @Override
    public Food createMango() {
        return new Mango();
    }

    
    @Override
    public DotAHero createMedusa() {
        return new Medusa();
    }

    @Override
    public DotAHero createNaga() {
        return new Naga();
    }

    @Override
    public DotAHero createZeus() {
        return new Zeus();
    }

    @Override
    public Vehicle createBus() {
        return new Bus();
    }
    
    @Override
    public Vehicle createCar() {
        return new Car();
    }

    @Override
    public Weapon createFighter() {
        return new Fighter();
    }
    
    @Override
    public Weapon createPistol() {
        return new Pistol();
    }

}
