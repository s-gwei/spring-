package com.sun.spring.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.aop.config.AOPConfig;
import com.sun.tx.TxConfig;
import com.sun.tx.UserService;

public class TxTest {
	AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(TxConfig.class);

	
	@Test
	public void test01(){
		UserService userService = acac.getBean(UserService.class);
		userService.insert();
		acac.close();
	}
}
