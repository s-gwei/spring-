package com.sun.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	
	
	@Autowired
	public UserDao userDao;
	
	
	@Transactional
	public void insert(){
		userDao.insert();
		System.out.println("插入成功");
	    int a = 10/0;	
	}

}
