package com.springexamples.xml.main;

import com.springexamples.entity.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadingCollections {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        Shape obj = (Shape) context.getBean("rectangleList");
        obj.draw();
    }
}