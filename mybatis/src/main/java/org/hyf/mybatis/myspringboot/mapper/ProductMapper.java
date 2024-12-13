package org.hyf.mybatis.myspringboot.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.hyf.mybatis.myspringboot.domain.Product;

/**
 * @Entity generator.domain.Product
 */

public interface ProductMapper {

    //    @Options(useCache = false)
    Product selectByPrimaryKey(Long id);


}




