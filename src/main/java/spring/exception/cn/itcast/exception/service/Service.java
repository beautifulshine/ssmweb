package exception.cn.itcast.exception.service;

import exception.cn.itcast.exception.ServiceMapping;

/**
 * 业务逻辑的总的接口
 * @author Administrator
 *
 */
public interface Service {
	public Object service(ServiceMapping serviceMapping) throws Exception;
}
