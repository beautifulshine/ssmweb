package com.li.fx.fx2;

import java.util.ArrayList;
import java.util.List;

public class CollectionGenFooDemo2 {
	public static void main(String args[]) {
        
        //CollectionGenFoo<ArrayList> listFoo = null;
         
        //listFoo = new CollectionGenFoo<ArrayList>(new ArrayList());
    
  
   CollectionGenFoo<?> listFoo1 = null;
         
        listFoo1=new CollectionGenFoo<ArrayList>(new ArrayList());
         
        System.out.println("实例化成功!");
     
    }
}
