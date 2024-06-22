package org.hyf.mybatis.myspringboot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnProperty(name = "a.b", matchIfMissing = false)
public class MySpringApplicationAutoConfiguration {


    @Bean
    public void MySpringApplicationAutoConfiguration (){
        System.out.println("MySpringApplicationAutoConfiguration============");
    }
}
