package exception.cn.itcast.exception.test;

import org.junit.Test;

import exception.cn.itcast.exception.ServiceInvocation;
import exception.cn.itcast.exception.ServiceMapping;


public class ExceptionTest {
	@Test
	public void test(){
		ServiceMapping serviceMapping = new ServiceMapping();
		serviceMapping.setServiceClass("exception.cn.itcast.exception.service.StudentServiceImpl");
		serviceMapping.setMethod("savePerson");
		ServiceInvocation.execution(serviceMapping);
	}
}
