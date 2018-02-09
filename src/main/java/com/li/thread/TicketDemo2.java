package com.li.thread;

class Ticket extends Thread
{   
	Ticket(String name)
    {
        super(name);        //构造函数：设置线程名称
    }
	Ticket()
    {
        super();        //构造函数：设置线程名称
    }
    private int ticket =100;
    public void run()
    {
        while(true)
        {
            if(ticket>0)
            {
                System.out.println(Thread.currentThread().getName()+"还有余票数："+ticket--);
            }
        }
    }
}
public class TicketDemo2 
{
    public static void main(String[] args) 
    {   
    	Ticket t1 = new Ticket("票窗口1");
    	Ticket t2 = new Ticket("票窗口2");
    	Ticket t3 = new Ticket("票窗口3");
    	Ticket t4 = new Ticket("票窗口4");
    	

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("Hello World!");
    }
}
