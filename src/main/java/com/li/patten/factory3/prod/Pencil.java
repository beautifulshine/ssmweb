package com.li.patten.factory3.prod;

import com.li.patten.factory3.interf.Writeable;

public class Pencil implements Writeable {

    @Override
    public void write(String label) {
        System.out.println("我是一支铅笔。我刚刚写下一句：“" + label + "”。");
    }

}
