package com.springexamples.xml.main;

import com.springexamples.entity.Octagon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleInitAndDestroyExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        System.out.println("Lifecyle");
        Octagon obj = (Octagon) context.getBean("octagon");
        obj.draw();
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}