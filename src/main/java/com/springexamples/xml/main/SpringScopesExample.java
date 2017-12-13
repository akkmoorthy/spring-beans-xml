package com.springexamples.xml.main;

import com.springexamples.entity.Shape;
import com.springexamples.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringScopesExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        System.out.println("Singleton Scope");
        Triangle singletonBeanA = (Triangle) context.getBean("singletonScopeBean");
        singletonBeanA.setType("Unilateral");
        singletonBeanA.draw();
        System.out.println("singletonBeanA == " + singletonBeanA);

        Shape singletonBeanB = (Shape) context.getBean("singletonScopeBean");
        singletonBeanB.draw();
        System.out.println("singletonBeanB == " + singletonBeanB);
        System.out.println("Is Singleton Bean A and Singleton B are same ? " +
                (singletonBeanA==singletonBeanB));

        System.out.println("\n\nPrototype Scope");
        Triangle prototypeBeanA = (Triangle) context.getBean("prototypeScopeBean");
        prototypeBeanA.setType("Unilateral");
        prototypeBeanA.draw();
        System.out.println(prototypeBeanA);
        Shape prototypeBeanB = (Shape) context.getBean("prototypeScopeBean");
        prototypeBeanB.draw();
        System.out.println(prototypeBeanB);
        System.out.println("Is Prototype Bean A and Prototype B are same ? " +
                (prototypeBeanA==prototypeBeanB));
    }
}