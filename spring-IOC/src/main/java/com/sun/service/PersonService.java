package com.sun.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sun.dao.PersonDao;

@Service
public class PersonService {
	
	
	@Qualifier("personDao")//强制装配personDao2
	@Autowired(required=false)
//	@Resource
	public PersonDao personDao;
	
	public void print(){
		System.out.println(personDao.getLabel());
	}

	@Override
	public String toString() {
		return "PersonService [personDao=" + personDao + "]";
	}

	
}
