package com.li.fx.fx4.d6;
/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日21:25:16
 * Description:  通过泛型方法返回泛型类型实例
 */
public class Demo6 {

    public static void main(String args[]) {
        Info<Integer> i=fun(30);
        System.out.println(i);
    }

    /**
     *
     * @param parame parame传入的类型
     * @param <T> type
     * @return <T extends Number>
     */
    public static <T extends Number> Info<T> fun(T parame){
        Info<T> tInfo=new Info<T>();
        tInfo.setVar(parame);
        return tInfo;
    }
}
