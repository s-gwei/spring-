package com.sun.spring_IOC;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.sun.bean.Son;
import com.sun.config.MainConfigOfProVal;

public class PropertyValueTest {
	
	AnnotationConfigApplicationContext applicationContext  =     new AnnotationConfigApplicationContext(MainConfigOfProVal.class);

	
	//通过配置文件，给相应的属性赋值
//	@Test
	public void test01(){
		printBeans(applicationContext);
		Son son = applicationContext.getBean(Son.class);
		System.out.println(son);
	}
	//通过applicationContext环境变量获取值
	@Test
	public void test02(){
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("son.nickName");
		System.out.println(property);
		applicationContext.close();
	}
	
	private void printBeans(AnnotationConfigApplicationContext applicationContext){
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
	}
}
