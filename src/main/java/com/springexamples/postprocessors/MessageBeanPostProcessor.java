package com.springexamples.postprocessors;

import com.springexamples.entity.MessageBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MessageBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("Step-6:::Post Process Before Initialization method is called : Bean Name " + beanName);
        if(bean instanceof MessageBean)
        {
            MessageBean messageBean = (MessageBean)bean;
            System.out.println("Value of Message is : " + messageBean.getMessage());
//            messageBean.setMessage("Updated Test Message");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
    throws BeansException {
        System.out.println("Step-9:::Post Process After Initialization method is called : Bean Name " + beanName);
        if(bean instanceof MessageBean)
        {
            MessageBean messageBean = (MessageBean)bean;
            System.out.println("Value of Message is : " + messageBean.getMessage());
        }
        return bean;
    }
}