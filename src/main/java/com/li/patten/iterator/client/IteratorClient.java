package com.li.patten.iterator.client;

import com.li.patten.iterator.impl.BreakfastMenu;
import com.li.patten.iterator.impl.LunchMenu;
import com.li.patten.iterator.impl.Waitress;
import com.li.patten.iterator.interf.Menu;
import com.li.patten.iterator.utils.Utils;

public class IteratorClient {

    private Menu menu = null;
    private Waitress waitress = null;
    
    public static void main(String[] args) {
        IteratorClient client = new IteratorClient();
        client.initEvent();
        client.operate();
    }
    
    private void initEvent() {
        menu = new BreakfastMenu();
        Utils.initMenuItem((BreakfastMenu)menu);
        
        menu = new LunchMenu();
        
        waitress = new Waitress(menu);
    }
    
    private void operate() {
        waitress.printMenu();
    }
}
