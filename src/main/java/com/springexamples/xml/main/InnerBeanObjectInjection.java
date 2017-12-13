package com.springexamples.xml.main;

import com.springexamples.entity.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanObjectInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        Circle obj = (Circle) context.getBean("circleWithInnerBeans");
        obj.draw();
    }
}