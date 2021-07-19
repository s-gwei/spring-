package com.sun.spring_IOC;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.bean.Car;
import com.sun.bean.Person;
import com.sun.config.MainConfigLive;

public class LifeTest {
	
	
//	@Test
	public void test01(){
		//1、创建ioc容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigLive.class);
		System.out.println("容器创建完成...");
//		String[] definitionNames = applicationContext.getBeanDefinitionNames();
//		for (String name : definitionNames) {
//			System.out.println(name);
//		}
		//单例时关闭容器，就销毁相应的实例
//		applicationContext.close();
		//多例时，getBean时才创建相应的实例
		Car bean = applicationContext.getBean(Car.class);
		bean.detory();
	}

	//InitializingBean实现初始化和销毁方法
//	@Test
	public void test02(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(MainConfigLive.class);
		System.out.println("容器创建完成...");
		applicationContext.close();
	}
	
	//JSR250；实现初始化和销毁方法
//	@Test
	public void test03(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(MainConfigLive.class);
		System.out.println("容器创建完成...");
		applicationContext.close();
	}
	
	//BeanPostProcessor:bean；bean的后置处理器
		@Test
		public void test04(){
			AnnotationConfigApplicationContext applicationContext = 
					new AnnotationConfigApplicationContext(MainConfigLive.class);
			System.out.println("容器创建完成...");
			applicationContext.close();
		}
}
