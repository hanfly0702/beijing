package com.hyf.assistant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TestApplicationContext {
    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
//        a example = (a) context.getBean("aBean");


        Iterator<String> stringIterator = new ArrayList<>(Arrays.asList("a", "b", "c")).iterator();
        //使用StreamSupport.stream()将Iterator转换成List
        //先将Iterator转成Iterable
        Iterable<String> stringIterable = () -> stringIterator;
        //再将Iterable转成List
        List<String> list2 = StreamSupport.stream(stringIterable.spliterator(), false).collect(Collectors.toList());

    }
}
