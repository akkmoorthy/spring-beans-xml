package com.springexamples.xml.main;

import com.springexamples.entity.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class BeanFactoryWithFileResourceExample {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/Users/kmoorthy/Desktop/Development/spring-standalone/spring/src/main/resources/spring-application-context.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
    }
}