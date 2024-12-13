package org.hyf.mybatis.myspringboot.web;


import org.hyf.mybatis.myspringboot.domain.Product;
import org.hyf.mybatis.myspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/test")
    public String test(@RequestParam("a") Long a, @RequestParam("b") String b, @RequestParam("c") String c) {

        Product p = productService.productInfo(a);

        return a + b;
    }


}
