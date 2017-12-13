package com.springexamples.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Octagon implements InitializingBean, DisposableBean {

    public void draw() {
        System.out.println("In Octagon");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("In Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet");
    }

    public void myInit()
    {
        System.out.println("My init method is called for Octagon");
    }

    public void cleanUp()
    {
        System.out.println("cleanUp method is called for Octagon");
    }
}