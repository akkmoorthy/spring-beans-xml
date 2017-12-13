package com.springexamples.xml.main;

import com.springexamples.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Example to demonstrate the spring “single instance per Spring IoC container” concept.
public class SpringSingletonScopesInDifferenXmlFilesExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Singleton Scope");
        Triangle singletonBeanA = (Triangle) context.getBean("singletonScopeBean");
        System.out.println("singletonBeanA == " + singletonBeanA);

        Triangle singletonBeanB = (Triangle) context1.getBean("singletonScopeBean");
        System.out.println("singletonBeanB == " + singletonBeanB);
        System.out.println("Is Singleton Bean A and Singleton B are same ? " +
                (singletonBeanA==singletonBeanB));
    }
}