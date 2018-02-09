package com.li.fx.fx4;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日20:20:17
 * Description:
 */
public class MyClass {

    public  static void main(String[] args){

        //method1()
        //Box<String> name=new Box<>("cc");
        //System.out.print("name"+name.getData());

        //method2()
        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);
        Box<Number> number = new Box<Number>(314);

        getDatas(name);
        getData(age);
        getData(number);
    }

    /**
     * Box<String> 当直接被定义为String类型的时候传入其他类型会报错
     * 所以我们用通配符来解决这个问题
     * @param data 传入的数据
     */
    public static void getData(Box<?>data){
        System.out.println("data :" + data.getData());
    }

    /**
     * 通配符的上限和下限(限制了他的类型)
     * @param data 传入的数据
     */
    public static void getDatas(Box<? extends String>data){
        System.out.println("data :" + data.getData());
    }
    /**
     *  只能接收String或Object类型的泛型
     * @param temp 传入的数据
     */
    public static void getDatass(Box<? super String> temp){
        System.out.print(temp + "、") ;
    }
}
