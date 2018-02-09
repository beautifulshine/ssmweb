package com.li.calendar;

class Parent {  
String one, two;  
public Parent(String a, String b) {  
    one = a;  
    two = b;      
    }  
    public void print() {  
    System.out.println(one);  
    }  
}  
public class Child extends Parent {  
public Child(String a, String b) {  
    super(a, b);  
    }  
    public void print() {  
        System.out.println(one + " to " + two);  
    }  
    public void ChildPrint(){System.out.println("这是子类里面都有的方法");}  
    public static void main(String arg[]) {  
        Parent p = new Parent("south", "north");  
        p.print();  
        Parent t = new Child("east", "west");  
        t.print();  
        
       // t.ChildPrint();  
    }  
}  
