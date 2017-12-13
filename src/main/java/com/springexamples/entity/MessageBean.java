package com.springexamples.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class MessageBean implements InitializingBean, DisposableBean,
        ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private String message;

        public MessageBean()
        {
        System.out.println("Step-1:::Instantiation of Bean::Constructor of  bean is called!");
        }

        public String getMessage() {
        return message;
        }

        public void setMessage(String message) {
            System.out.println("Step-2:::Populate Properties(In setMessage)");
        this.message = message;
        }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Step-3:::setBeanName:: Bean Name defined in context = "
                + beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step-4:::setBeanFactory:: Message Bean singleton = "
                + beanFactory.isSingleton("messageBean"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        System.out.println("Step-5:::setApplicationContext:: Bean Definition Names = "
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Step-7:::InitializingBean Interface Implementation");
    }

    public void init() throws Exception {
        System.out.println("Step-8:::Custom init method of  bean is called!");
    }

    public void destroy() throws Exception {
        System.out.println("Last Step-10:::DisposableBean Interface Implementation");
    }

    public void cleanUp() throws Exception {
        System.out.println("Last Step-11:::Custom destroy method of  bean is called!");
    }
}