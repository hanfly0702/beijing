package com.hyf.assistant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan(basePackages = "com.hyf.assistant.mapper")
public class AssistantApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(AssistantApplication.class)
                .bannerMode(Banner.Mode.OFF)
                //.web(WebApplicationType.NONE)
                .run(args);
    }

}
