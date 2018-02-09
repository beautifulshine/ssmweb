package spring_aop.cn.itcast.spring0909.aop.annotation;

import org.junit.Test;

import spring_ioc.cn.itcast.spring0909.utils.SpringHelper;


/**
 * 
 * @author Administrator
 *
 */
public class PersonTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/aop/annotation/applicationContext.xml";
	}
	
	@Test
	public void test() throws Exception{
		PersonDaoImpl personDao = (PersonDaoImpl)context.getBean("personDao");
		personDao.getPerson();
	}
}
