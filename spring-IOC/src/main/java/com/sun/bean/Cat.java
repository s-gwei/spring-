package com.sun.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class Cat implements InitializingBean,DisposableBean{

	public Cat(){
		System.out.println("cat  constructor...");
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat init...");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat destroy....");
	}


	
	

}
