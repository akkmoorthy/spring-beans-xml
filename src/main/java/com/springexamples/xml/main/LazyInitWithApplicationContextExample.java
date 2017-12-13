package com.springexamples.xml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
When using ApplicationContext the beans get instantiated. Lazy Initialization doesn't happen
 */
public class LazyInitWithApplicationContextExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
//        DisplayMessage obj = (DisplayMessage) context1.getBean("displayMessageBean");
//        System.out.println(obj.getMessage());
    }
}