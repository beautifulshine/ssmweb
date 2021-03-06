package spring_aop.cn.itcast.spring0909.aop.exception.service;

import cn.itcast.spring0909.aop.exception.dao.PersonDao;

public class PersonServiceImpl implements PersonService{

	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson() throws Exception {
		// TODO Auto-generated method stub
		this.personDao.savePerson();
	}

	@Override
	public void updatePerson() throws Exception {
		// TODO Auto-generated method stub
		this.personDao.updatePerson();
	}

	@Override
	public void deletePerson() throws Exception {
		// TODO Auto-generated method stub
		this.personDao.deletePerson();
	}

}
