package com.li.patten.bridge2;

public class Sony implements TV {

    @Override
    public void on() {
        System.out.println("Sony被打开了");
    }

    @Override
    public void off() {
        System.out.println("Sony被关闭了");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("切换到第" + channel + "频道了");
    }

}
