package com.li.fx.fx2;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionGenFoo<T extends Collection> {
	 private T x;
	 
	    public CollectionGenFoo(T x) {
	        this.x = x;
	    }
	 
	    public T getX() {
	        return x;
	    }
	 
	    public void setX(T x) {
	        this.x = x;
	    }
}
