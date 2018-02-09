package com.li.patten.factory3.factorys;

import com.li.patten.factory3.interf.Flyable;
import com.li.patten.factory3.interf.Moveable;
import com.li.patten.factory3.interf.Writeable;
import com.li.patten.factory3.prod.Aircraft;
import com.li.patten.factory3.prod.Car;
import com.li.patten.factory3.prod.Pen;

/**
 * <p>
 * 第一个工厂生产：客机、汽车和铅笔
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Factory1 extends AbstractFactory {

    @Override
    public Flyable createFlyable() {
        return new Aircraft();
    }

    @Override
    public Moveable createMoveable() {
        return new Car();
    }

    @Override
    public Writeable createWriteable() {
        return new Pen();
    }

}
