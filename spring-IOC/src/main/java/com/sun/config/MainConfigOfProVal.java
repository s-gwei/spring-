package com.sun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sun.bean.Son;

//读取外部的配置文件，使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value = { "classpath:/son.properties" })

@Configuration
public class MainConfigOfProVal {
	
	
	@Bean
	public Son Son(){
		return new Son();
	}

}
