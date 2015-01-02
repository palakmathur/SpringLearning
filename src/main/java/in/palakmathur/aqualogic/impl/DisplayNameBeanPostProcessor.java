package in.palakmathur.aqualogic.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class DisplayNameBeanPostProcessor implements BeanPostProcessor{


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws
            BeansException {
        System.out.println("In postProcessBeforeInitialization. Bean Name:" +
                beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws
            BeansException {

        System.out.println("In postProcessAfterInitialization. Bean Name:" +
                beanName);

        return bean;


    }
}


