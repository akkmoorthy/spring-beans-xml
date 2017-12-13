package com.springexamples.xml.main;

import com.springexamples.entity.MessageBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleExampleMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans-post-processor.xml");
        MessageBean bean = (MessageBean)context.getBean("messageBean");
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}