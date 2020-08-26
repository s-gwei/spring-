package com.sun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.FilterType;
import com.sun.bean.Person;

//配置文件的方式生成实例
//@Configuration
//配置包扫描
//@ComponentScan(value="com.sun")

//excludeFilters=
//@Filter(type=FilterType.ANNOTATION,classes={Controller.class}) 有controller注解的不会为该类生成实例

public class MainConfig {
	
	
    //通过方法名和bean注解value值都可以修改实例名称,但是value会覆盖方法名
	@Bean(value="person01")
	public Person person(){
		return new Person("lisi", 20);
	}
}
