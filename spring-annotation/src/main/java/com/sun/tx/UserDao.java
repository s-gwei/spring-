package com.sun.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	
	public void insert() {
		// TODO Auto-generated method stub
		String sql = "insert into t_user (id,name) values(?,?)";
	    int id = 3;
	    String name = "张三";
		jdbcTemplate.update(sql, id,name);
	}

}
