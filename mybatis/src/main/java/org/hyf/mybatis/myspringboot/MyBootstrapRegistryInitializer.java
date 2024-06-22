package org.hyf.mybatis.myspringboot;

import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyBootstrapRegistryInitializer implements BootstrapRegistryInitializer {


    @Override
    public void initialize(BootstrapRegistry registry) {
        System.out.println("加载自定义MyBootstrapRegistryInitializer...");

    }
}