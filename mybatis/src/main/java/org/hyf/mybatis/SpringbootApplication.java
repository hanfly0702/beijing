package org.hyf.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.hyf.mybatis.myspringboot.mapper")
//@ComponentScan(basePackages = "org.hyf.mybatis.myspringboot.web")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);


    }
}