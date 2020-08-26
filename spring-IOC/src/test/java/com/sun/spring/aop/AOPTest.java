package com.sun.spring.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.aop.bean.MathCalculator;
import com.sun.aop.config.AOPConfig;

public class AOPTest {
	
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AOPConfig.class);
		MathCalculator mathCalculator  = acac.getBean(MathCalculator.class);
		mathCalculator.div(1, 0);
		acac.close();
	}

}
