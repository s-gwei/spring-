package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * author sungw
 *
 * @description ʵ��spring�ײ�ӿ�
 * @date 2021/6/6
 */
public class Sun implements ApplicationContextAware {

    private  ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("�����ioc"+applicationContext);
        this.applicationContext = applicationContext;
    }
}
