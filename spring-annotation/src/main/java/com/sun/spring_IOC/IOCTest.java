package com.sun.spring_IOC;

import java.util.Map;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.sun.bean.Person;
import com.sun.config.MainConfig;
import com.sun.config.MainConfig2;



public class IOCTest {

	//配置包扫描,
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
	}
	
	
	   //配置包扫描,
		@Test
		public void test02(){
			AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
			String[] definitionNames = applicationContext.getBeanDefinitionNames();
			//获取操作系统名称
			ConfigurableEnvironment environment  = applicationContext.getEnvironment();
			//动态获取环境变量的值；Windows 10
			String property = environment.getProperty("os.name");
			System.out.println(property);
			for (String name : definitionNames) {
				System.out.println(name);
			}
			Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
			System.out.println(persons);
		}
}
