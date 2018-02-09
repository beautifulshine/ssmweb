package mvc.cn.itcast.spring0909.mvc.spring;

import org.junit.Test;

import spring_ioc.cn.itcast.spring0909.utils.SpringHelper;


public class PersonTest extends SpringHelper{
	static{
		path = "applicationContext.xml";
	}
	
	@Test
	public void test(){
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.savePerson();
	}
}
