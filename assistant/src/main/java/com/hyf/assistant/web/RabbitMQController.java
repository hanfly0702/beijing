package com.hyf.assistant.web;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;


//@RestController
public class RabbitMQController {

//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    @GetMapping("/rabbit1")
//    public void testHello(String a) {
//        rabbitTemplate.convertAndSend("hello", "hello world" + a);
//    }
//
//
//    @GetMapping("/rabbit2")
//    public void testFanout() {
//        rabbitTemplate.convertAndSend("logs1", "", "这是日志广播");
//    }
//
//    @GetMapping("/rabbit3")
//    public void testDirect() {
//        rabbitTemplate.convertAndSend("directs", "error", "error 的日志信息");
//    }
//
//    @GetMapping("/rabbit4")
//    public void testDirect1() {
//        rabbitTemplate.convertAndSend("directs", "info", "error 的日志信息");
//    }
//
//    @GetMapping("/rabbit5")
//    public void testTopic() {
//        rabbitTemplate.convertAndSend("topics", "user.save.findAll", "user.save.findAll 的消息");
//    }
//
//    @GetMapping("/rabbit6")
//    public void testTopic1() {
//        rabbitTemplate.convertAndSend("topics", "user.save", "user.save 的消息");
//    }
//
//
//    @GetMapping("/sendDirectMessage")
//    public String sendDirectMessage() {
//        String messageId = String.valueOf(11);
//        String messageData = "test message, hello!";
//        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        Map<String, Object> map = new HashMap<>();
//        map.put("messageId", messageId);
//        map.put("messageData", messageData);
//        map.put("createTime", createTime);
//        //将消息携带绑定键值：testDirectRouting 发送到交换机testDirectExchange
//        rabbitTemplate.convertAndSend("testDirectExchange", "testDirectRouting", map);
//        return "test Direct exchange";
//    }

}
