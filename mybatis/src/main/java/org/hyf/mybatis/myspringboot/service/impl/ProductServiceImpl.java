package org.hyf.mybatis.myspringboot.service.impl;


import org.hyf.mybatis.myspringboot.domain.Product;
import org.hyf.mybatis.myspringboot.mapper.ProductMapper;
import org.hyf.mybatis.myspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    ProductMapper productMapper;


    @Override
    public Product productInfo(Long id) {
        Product product1 = productMapper.selectByPrimaryKey(id);
//        Product product2 = productMapper.selectByPrimaryKey(id);

//        System.err.println(product1 == product2);

        return null;
    }
}
