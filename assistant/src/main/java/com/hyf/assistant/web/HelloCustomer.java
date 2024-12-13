package com.hyf.assistant.web;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class HelloCustomer {

    @RabbitListener(queuesToDeclare = @Queue("hello"))
    public void receive0(String message) {
        System.out.println("message = " + message);
    }


    @RabbitListener(bindings = @QueueBinding(value = @Queue,
            exchange = @Exchange(name = "logs1", type = "fanout")))
    public void receive1(String message) {
        System.out.println("message1 = " + message);
    }

    @RabbitListener(bindings = @QueueBinding(value = @Queue, //创建临时队列
            exchange = @Exchange(name = "logs1", type = "fanout")  //绑定交换机类型
    ))
    public void receive2(String message) {
        System.out.println("message2 = " + message);
    }


    @RabbitListener(bindings = {@QueueBinding(value = @Queue(), key = {"info", "error"},
            exchange = @Exchange(type = "direct", name = "directs")
    )})
    public void receive3(String message) {
        System.out.println("message1 = " + message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue(),
                    key = {"error"},
                    exchange = @Exchange(type = "direct", name = "directs")
            )})
    public void receive4(String message) {
        System.out.println("message2 = " + message);
    }


    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    key = {"user.*"},
                    exchange = @Exchange(type = "topic", name = "topics")
            )
    })
    public void receive5(String message) {
        System.out.println("message1 = " + message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    key = {"user.#"},
                    exchange = @Exchange(type = "topic", name = "topics")
            )
    })
    public void receive6(String message) {
        System.out.println("message2 = " + message);
    }
}