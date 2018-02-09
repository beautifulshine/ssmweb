package com.li.thread;

class Ticket2 implements Runnable  //extends Thread
{   
    
    private int ticket =100;
    public void run()
    {
        synchronized (this) {
        		while(ticket>0)
        		{         
			
        	System.out.println(Thread.currentThread().getName()+"还有余票数："+ticket--);        
		}  
        }
    }
}
public class TicketDemo 
{
    public static void main(String[] args) throws InterruptedException 
    {   
        Ticket2 t =new Ticket2();

        Thread t1 = new Thread(t,"票窗口1");
        Thread t2 = new Thread(t,"票窗口2");
        Thread t3 = new Thread(t,"票窗口3");
        Thread t4 = new Thread(t,"票窗口4");
 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Hello World!");
    }
}
