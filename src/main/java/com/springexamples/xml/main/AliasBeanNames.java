package com.springexamples.xml.main;

import com.springexamples.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AliasBeanNames {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        System.out.println("Alias Name as Attribute");
        Triangle obj = (Triangle) context.getBean("triangle-alias");
        obj.draw();

        System.out.println("Alias Name as Element");
        Triangle obj1 = (Triangle) context.getBean("triangle-alias1");
        obj1.draw();
    }
}