package document.cn.itcast.spring0909.document.spring;

import org.junit.Test;
import spring_ioc.cn.itcast.spring0909.utils.SpringHelper;

public class DocumentTest extends SpringHelper {
	static{
		path = "applicationContext.xml";
	}
	@Test
	public void test(){
		DocumentManager documentManager = (DocumentManager)context.getBean("documentManager");
		documentManager.read();
	}
}
