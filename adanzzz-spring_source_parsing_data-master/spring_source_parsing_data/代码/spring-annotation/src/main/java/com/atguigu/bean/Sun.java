package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * author sungw
 *
 * @description 实现spring底层接口
 * @date 2021/6/6
 */
public class Sun implements ApplicationContextAware {

    private  ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的ioc"+applicationContext);
        this.applicationContext = applicationContext;
    }
}
