package spring_aop.cn.itcast.spring0909.aop.annotation;

import java.util.List;


/**
 * 目标接口
 * @author Administrator
 *
 */
public interface PersonDao {
	public void savePerson();
	public void updatePerson();
	public void deletePerson();
	public List<Person> getPerson();
}
