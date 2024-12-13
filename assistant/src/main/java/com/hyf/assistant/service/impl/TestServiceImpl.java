package com.hyf.assistant.service.impl;

import com.hyf.assistant.domain.Product;
import com.hyf.assistant.mapper.ProductMapper;
import com.hyf.assistant.mapper.WxtestMapper;
import com.hyf.assistant.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    WxtestMapper wxtestMapper;
    @Resource
    ProductMapper productMapper;

    @Override
    public Integer test() {
        return wxtestMapper.find();
    }


    @Override
//    @Transactional
    public Product productTest(Long id) {

        Product  product1 = productMapper.selectByPrimaryKey(id);
        Product  product2 = productMapper.selectByPrimaryKey(id);

        System.err.println(product1== product2);


        return productMapper.selectByPrimaryKey(id);
    }
}
