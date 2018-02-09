package com.qq.somnus.proxy;

/** 
 * @Title: StaticClient.java 
 * @Package com.somnus.proxy 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月3日 下午1:29:18 
 * @version V1.0 
 */
public class StaticClient {

    public static void main(String[] args) {
    HelloImpl helloImpl=	new HelloImpl();
    helloImpl.say("ss");
//        Hello helloProxy = new HelloProxy(new HelloImpl());
//        helloProxy.say("mary");
    }

}
