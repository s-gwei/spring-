package com.sun.spring_IOC;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.bean.Red;
import com.sun.config.MainConfigAutowired;
import com.sun.dao.PersonDao;
import com.sun.service.PersonService;

public class AutowiredTest {
	
	AnnotationConfigApplicationContext applicationContext 
	  = new AnnotationConfigApplicationContext(MainConfigAutowired.class);

	
	@Test
	public void test01(){
		PersonService personService = applicationContext.getBean(PersonService.class);
//		personService.print();
//		System.out.println(personService);
		//当beanFactory中有两个相同类型的bean时，获取会报错
//		PersonDao personDao = applicationContext.getBean(PersonDao.class);
//		personDao.getLabel();
		
		Red red = applicationContext.getBean(Red.class);
//		red.setApplicationContext(applicationContext);
//		red.setBeanName(applicationContext.getDisplayName());
		System.out.println(applicationContext.getDisplayName());
		applicationContext.close();
	}
}
