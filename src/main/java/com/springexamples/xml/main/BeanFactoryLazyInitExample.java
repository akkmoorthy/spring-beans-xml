package com.springexamples.xml.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
/*
When using BeanFactory the beans wont get instantiated until getBean is used
. Lazy Initialization happens
 */
public class BeanFactoryLazyInitExample {
    public static void main(String[] args) {
        BeanFactory factory1 = new XmlBeanFactory(new ClassPathResource("beans.xml"));

//        BeanFactory factory2 = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        DisplayMessage obj = (DisplayMessage) factory2.getBean("displayMessageBean");
//        System.out.println(obj.getMessage());
    }
}