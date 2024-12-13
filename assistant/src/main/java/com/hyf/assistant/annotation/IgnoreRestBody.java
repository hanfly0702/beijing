package com.hyf.assistant.annotation;

import java.lang.annotation.*;

/**
 *
 * 忽略统一返回的格式封装，返回具体Controller中定义的类型
 *
 * @author hanyufei
 * @date 2021-06-05 14:49
 * @version 1.0
 */
@Documented
@Inherited
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreRestBody {
}