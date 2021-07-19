package com.sun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sun.bean.Car;

/**
 * bean的生命周期：创建，初始化，销毁
 * 
 * 其中初始化过程最为重要
 * 
 * bean的创建
 * 单实例在容器启动的时候创建
 * 多实例：在每次获取的时候创建对象
 * 
 * BeanPostProcessor对bean二次加工
 * 
 * BeanPostProcessor.postProcessBeforeInitialization
 * 初始化：
 * 		对象创建完成，并赋值好，调用初始化方法。。。
 * BeanPostProcessor.postProcessAfterInitialization
 *  销毁：
 * 		单实例：容器关闭的时候
 * 		多实例：容器不会管理这个bean；容器不会调用销毁方法,可以自己调用指定的销毁方法进行销毁
 * 
 * 1)指定初始化和销毁方法
 *   通过@Bean指定init-method和destroy-method；
 *   
 * 2）、通过让Bean实现InitializingBean（定义初始化逻辑），
 * 				DisposableBean（定义销毁逻辑）;  
 * 3）、可以使用JSR250；
 * 		@PostConstruct：在bean创建完成并且属性赋值完成；来执行初始化方法
 * 		@PreDestroy：在容器销毁bean之前通知我们进行清理工作
 * 4) BeanPostProcessor:bean的后置处理器
 *    在bean的初始化前后做一些处理工作
 *    postProcessBeforeInitialization:在bean初始化之前工作
 *    postProcessAfterInitialization:在bean初始化之后工作
 * 
 * 
 * 
 * 遍历得到容器中所有的BeanPostProcessor；挨个执行beforeInitialization，
 * 一但返回null，跳出for循环，不会执行后面的BeanPostProcessor.postProcessorsBeforeInitialization
 * 
 * BeanPostProcessor原理
 * populateBean(beanName, mbd, instanceWrapper);给bean进行属性赋值
 * initializeBean
 * {
 * applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 * invokeInitMethods(beanName, wrappedBean, mbd);执行自定义初始化
 * applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 *}
 * 我们得知，在invokeInitMethods的执行前后，spring会分别调用所有的BeanPostProcessor，执行其中的方法，
 * 那么invokeInitMethods的具体内容我们仍需要看下，发现此方法主要作用有两个：1、判断bean是否继承了InitializingBean，
 * 如果继承接口，执行afterPropertiesSet()方法，2、获得是否设置了init-method属性，如果设置了，就执行设置的方法
 * 
 * 
 * 
 * spring底层对BeanPostProcessor的使用
 * 		bean赋值，注入其他组件，@Autowired，生命周期注解功能，@Async,xxx BeanPostProcessor;
 */

@Configuration
@ComponentScan(value="com.sun.bean")
public class MainConfigLive {

	@Scope("prototype")
//	@Bean(initMethod="init",destroyMethod="detory")
	public Car car(){
		return new Car();
	}
}
