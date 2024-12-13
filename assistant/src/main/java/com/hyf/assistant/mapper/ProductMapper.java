package com.hyf.assistant.mapper;


import com.hyf.assistant.domain.Product;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Options;

/**
 * @Entity generator.domain.Product
 */
@CacheNamespace
public interface ProductMapper {

//    @Options(useCache = false)
    Product selectByPrimaryKey(Long id);


}




