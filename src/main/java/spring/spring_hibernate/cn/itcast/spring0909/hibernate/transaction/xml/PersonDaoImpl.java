package spring_hibernate.cn.itcast.spring0909.hibernate.transaction.xml;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}

}
