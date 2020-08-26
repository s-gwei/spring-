package com.sun;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.sun.bean.Person;
import com.sun.config.MainConfig;

public class MainTest {
	
	public static void main(String[] args) {
		//bean.xml方式注册实例
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
////		Person person = (Person) applicationContext.getBean("person");
//		Person person = (Person) applicationContext.getBean(Person.class);
//		System.out.println(person.toString());
		
		//注解的方式注册实例
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
		//查看某个类型实例的实例name
		String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		
		for (String name : namesForType) {
			System.out.println(name);
			
		}
		
	
	}

}
