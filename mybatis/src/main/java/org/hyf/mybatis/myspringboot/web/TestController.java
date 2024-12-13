package org.hyf.mybatis.myspringboot.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/test")
    public String test(@RequestParam("a") String a, @RequestParam("b") String b) {
        System.out.println(a);
        System.out.println(b);

        return a + b;
    }

}
