package org.hyf.mybatis.myspringboot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class InitialingzingBeanTest implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean..");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("init...");
    }
}
