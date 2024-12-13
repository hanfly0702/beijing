package com.hyf.assistant.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyf.assistant.annotation.IgnoreRestBody;
import com.hyf.assistant.domain.Rest;
import com.hyf.assistant.domain.RestBody;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 统一返回体包装器
 *
 * @author hanyufei
 * @version 1.0
 * @date 2021-06-04 17:39
 */
//@RestControllerAdvice
public class RestBodyAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return !methodParameter.hasMethodAnnotation(IgnoreRestBody.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        if (true || serverHttpRequest.getHeaders().containsKey("special")) {
            return body;
        }

        ServletServerHttpResponse response = (ServletServerHttpResponse) serverHttpResponse;
        response.getHeaders().setContentType(MediaType.parseMediaType("application/json;charset=UTF-8"));
        if (body == null) {
            return RestBody.ok();
        }

        if (Rest.class.isAssignableFrom(body.getClass())) {
            return body;
        }
        if (body instanceof String) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(RestBody.okData(body));
            } catch (JsonProcessingException e) {

            }

        }

        return RestBody.okData(body);
    }
}