package com.springexamples.xml.main;

import com.springexamples.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application-context.xml");

        System.out.println("1 Param Constructor Injection");
        Triangle obj = (Triangle) context.getBean("contructorInjectionWithOneParam");
        obj.draw();

        System.out.println("2 Param Constructor Injection");
        Triangle obj1 = (Triangle) context.getBean("contructorInjection");
        obj1.draw();

        System.out.println("Constructor Injection which calls wrong constructor");
        Triangle obj2 = (Triangle) context.getBean("contructorInjectionWithWrongConstructorCall");
        obj2.draw();

        System.out.println("Constructor Injection with Type mentioned in the xml config to call appropriate constructor");
        Triangle obj3 = (Triangle) context.getBean("contructorInjectionWithType");
        obj3.draw();

        System.out.println("Constructor Injection by specifying index");
        Triangle obj4 = (Triangle) context.getBean("contructorInjectionWithIndex");
        obj4.draw();
    }
}