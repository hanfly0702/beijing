package org.hyf.mybatis.myspringboot;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationInit implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        System.out.println("加载自定义ApplicationContextInitializer...");
    }
}