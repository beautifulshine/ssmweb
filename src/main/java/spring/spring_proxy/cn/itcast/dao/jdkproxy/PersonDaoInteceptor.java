package spring_proxy.cn.itcast.dao.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 感觉像是织入器 将增强和切点类作为属性
 * @TODO 
 * @author  Myth
 * @date 2016年11月20日 上午9:18:54
 */
public class PersonDaoInteceptor implements InvocationHandler{
	
	private Transaction transaction;
	private Object target;
	
	public PersonDaoInteceptor(Transaction transaction,Object target){
		this.transaction = transaction;
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object obj;
		String methodName = method.getName();
		//对指定的方法增强
		if("savePerson".equals(methodName)||
				"updatePerson".equals(methodName)||
				"deletePerson".equals(methodName)){
			this.transaction.beginTransaction();
			obj = method.invoke(this.target, args);//调用目标类的目标方法
			this.transaction.commit();
		}else{
			obj = method.invoke(this.target, args);//调用目标类的目标方法
		}
		return obj;
	}

}
