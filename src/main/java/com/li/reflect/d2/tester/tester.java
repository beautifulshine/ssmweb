package com.li.reflect.d2.tester;

import com.li.reflect.d2.dao.NetJavaSession;
import com.li.reflect.d2.util.UserInfo;

public class tester {
	  public static void main(String args[]) {
	        //获得NetJavaSession对象
	        NetJavaSession session = new NetJavaSession();
	        //创建一个UserInfo对象
	        UserInfo user = new UserInfo();
	        //设置对象的属性
	        user.setId(6988);
	        user.setAge(44);
	        user.setPwd("pwd");
	        user.setName("champion");
	        
	        //将对象保存到数据库中
	        String sql = session.getSaveObjectSql(user);
	        System.out.println("保存对象的sql语句：" + sql);
		     int result =   session.saveObject(user);
		     System.out.println(result);
	        //查找对象
	        UserInfo userInfo=(UserInfo) session.getObject("com.li.reflect.d2.util.UserInfo", 1);
	        System.out.println("获取到的信息：" + userInfo);
	 
	    }
}
