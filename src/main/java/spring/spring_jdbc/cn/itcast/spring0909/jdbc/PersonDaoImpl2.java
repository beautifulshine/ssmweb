package spring_jdbc.cn.itcast.spring0909.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDaoImpl2 implements PersonDao {
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void savePerson() {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().execute(
				"insert into course(cid,cname) values(4,'aaa')");
	}
	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}
}
