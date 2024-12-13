package com.hyf.assistant.web;


import com.hyf.assistant.domain.A;
import com.hyf.assistant.domain.b;
import com.hyf.assistant.service.TestService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {


    private boolean hasNextPage(Integer total, Integer current, Integer Limit) {
        int LastIndex = current * Limit;
        return LastIndex < total;
    }


    @Resource
    TestService service;

    @PostMapping("testUp")
    public String testUp(@RequestBody b bb) {
        return "success";
    }

    @RequestMapping(method = RequestMethod.POST, value = "testUp1")
    public String testU1(@RequestBody b bb) {
        return "success";
    }


    @GetMapping("test3")
    public String test1(@Validated @RequestBody A testDto) {
        System.out.println(testDto);
        return "success";
    }

    @GetMapping("/test")
    public Integer test(@RequestParam("a") String a, @RequestParam("b") String b) {
        System.out.println(a);
        System.out.println(b);

        // return service.test();
        return null;
    }

    @GetMapping("/test1")
    public void test1() {

        service.productTest(1l);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            aaa(i);
        }

    }

    static void aaa(int i) {
        System.out.println(i);
    }

    public static void main1(String[] args) {

        List<String> strings = Arrays.asList("1", "2", "5", "4", "1");
        List<String> collect = strings.stream().distinct().sorted().collect(Collectors.toList());
        collect.forEach(System.out::println);

        byte[] bytes = "hello world".getBytes();
        //Base64 Encoded
        String encoded = Base64.getEncoder().encodeToString(bytes);

        System.out.println(encoded);

        //Base64 Decoded
        byte[] decoded = Base64.getDecoder().decode(encoded);
        //Nerify original content
        System.out.println(new String(decoded));

        //ArrayList<a> aList = BuildList();
//
//                ArrayList < String > aa = new ArrayList<>();
//
//        aa.add(0, "1");
//        aa.add(0, "2");
//
//        System.out.println(1);

    }

    public static <M> void merge(M destination, M target) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(target.getClass());

        // Iterate over all the attributes
        for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {

            // Only copy writable attributes
            if (descriptor.getWriteMethod() != null) {
                Object originalValue = descriptor.getReadMethod().invoke(target);

                // Only copy values values where the destination values is null
                if (originalValue == null) {
                    Object defaultValue = descriptor.getReadMethod().invoke(destination);
                    descriptor.getWriteMethod().invoke(target, defaultValue);
                }

            }
        }
    }


    private ArrayList BuildList() {
        ArrayList<A> aList = new ArrayList();

        A a1 = new A();
        a1.setId("1");
        a1.setAa("2");
        aList.add(a1);

        A a2 = new A();
        a2.setId("1");
        a2.setBb("2");
        aList.add(a2);

        A a3 = new A();
        a3.setId("1");
        a3.setCc("2");
        aList.add(a3);

        A a4 = new A();
        a4.setId("22");
        a4.setAa("2");
        aList.add(a4);

        A a5 = new A();
        a4.setId("22");
        a4.setCc("2");
        aList.add(a4);

        return aList;
    }

}
