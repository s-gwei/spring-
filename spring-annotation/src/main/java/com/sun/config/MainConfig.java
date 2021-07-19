package com.sun.config;

import com.sun.dao.PersonDao;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import com.sun.bean.Person;
import org.springframework.stereotype.Service;

//配置文件的方式生成实例
@Configuration
//配置包扫描
//@ComponentScan(value="com.sun")

//excludeFilters=有controller注解的不会为该类生成实例
//@Filter(type=FilterType.ANNOTATION,classes={Controller.class})
@ComponentScans(
		value = {
				@ComponentScan(value="com.sun",includeFilters = {
					@Filter(type=FilterType.ANNOTATION,classes={Controller.class})
						,
						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={Person.class}),
//						@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
				},useDefaultFilters = false)
		}
)
public class MainConfig {
	
	
    //通过方法名和bean注解value值都可以修改实例名称,但是value会覆盖方法名
//	@Bean(value="person")
//	public Person person(){
//		return new Person("lisi", 20);
//	}
}
