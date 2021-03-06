package com.springexamples.xml.main;

import com.springexamples.entity.Shape;
import com.springexamples.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
When a new instantiation of ApplicationContext is made, then the object differs
 */
public class SpringScopeWithTwiceApplicationContextInstantiationExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        System.out.println("Singleton Scope");
        Triangle singletonBeanA = (Triangle) context.getBean("singletonScopeBean");
        singletonBeanA.setType("Unilateral");
        singletonBeanA.draw();
        System.out.println("singletonBeanA == " + singletonBeanA);

        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-application-context.xml");
        Shape singletonBeanB = (Shape) context1.getBean("singletonScopeBean");
        singletonBeanB.draw();
        System.out.println("singletonBeanB == " + singletonBeanB);
        System.out.println("Is Singleton Bean A and Singleton B are same ? " +
                (singletonBeanA==singletonBeanB));
    }
}