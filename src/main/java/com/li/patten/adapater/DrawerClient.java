package com.li.patten.adapater;


public class DrawerClient {

    public static void main(String[] args) {
        String label = "Hello world!";
        
       // System.out.println("\n---------- 我是黑笔 ----------");
        BlackPencil blackPencil = new BlackPencil();
       // blackPencil.drawBlack(label);
       // ThreadUtils.sleep(20);
        
       // System.out.println("\n---------- 我是红笔 ----------");
        RedPencil redPencil = new RedPencil();
      //  redPencil.drawRed(label);
        //ThreadUtils.sleep(20);
        
        System.out.println("\n---------- 我是黑笔 ----------");
        ColorAdapter adapter = new ColorAdapter(blackPencil);
        ColorAdapter adapter2 = new ColorAdapter(redPencil);
        adapter2.drawBlack(label);
    }
}
