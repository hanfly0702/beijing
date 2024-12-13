package com.hyf.assistant.web;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DirectRabbitConfig {

    /**
     * 定义队列
     * @return
     */
   // @Bean
    public Queue testDirectQueue(){
        //testDirectRabbit 是自定义的队列名
        //durable ： 是否持久化,默认是false。
        // 持久化对列：会被存储到磁盘上，当消息代理重启时仍然存在
        //暂缓对列：当前连接有效
        //exclusive 默认也是false，只能被当前创建的连接使用，而且当前对列关闭后对列立即被删除
        //autoDelete ：  是否自动删除，当没有生产者或者消费者使用此对列时，该队列会自动删除
        //return new Queue("testDirectRabbit", true, false, false);
        //一般设置一下对列的持久化就行，其余两个默认false就行
        return new Queue("testDirectQueue", true);
    }

    /**
     * 定义direct 交换机
     * @return
     */
  //  @Bean
    public DirectExchange testDirectExchange(){
        //三个参数分别是：name ,durable,autoDelete
        return new DirectExchange("testDirectExchange",true , false);
    }

    /**
     * 绑定
     * @return
     */
  //  @Bean
    public Binding bingingDirect(){
        return BindingBuilder.bind(testDirectQueue()).to(testDirectExchange()).with("testDirectRouting");
    }


  //  @Bean
    public DirectExchange lonelyDirectExchange(){
        return new DirectExchange("lonelyDirectExchange");
    }

}
