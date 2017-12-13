package com.springexamples.xml.main;

import com.springexamples.entity.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        System.out.println("Autowiring by Name");
        Shape obj = (Shape) context.getBean("autowiringByName");
        obj.draw();

        //In this case, there should be only one bean which is of that type
        System.out.println("Autowiring by Type");
        Shape obj1 = (Shape) context.getBean("autowiringByType");
        obj1.draw();
    }
}