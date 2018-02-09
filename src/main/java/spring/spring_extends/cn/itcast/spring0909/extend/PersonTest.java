package spring_extends.cn.itcast.spring0909.extend;

import org.junit.Test;

import spring_ioc.cn.itcast.spring0909.utils.SpringHelper;



public class PersonTest extends SpringHelper{
	static{
		path = "maven-ssm-web/src/main/java/spring/spring_extends/cn/itcast/spring0909/extend/applicationContext.xml";
	}
	
	@Test
	public void test(){
		Student student = (Student)context.getBean("student");
		student.say();
	}
}
