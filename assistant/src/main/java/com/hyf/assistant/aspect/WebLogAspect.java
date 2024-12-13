package com.hyf.assistant.aspect;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.util.Arrays;

/**
 *
 * Controller层日志切面
 *
 * @author hanyufei
 * @date 2021-06-05 14:53
 * @version 1.0
 */
@Aspect
@Component
public class WebLogAspect {
    private final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    private ObjectMapper objectMapper = new ObjectMapper();

    @Pointcut("execution(public * com.hyf.assistant..*.web.*.*(..))")
    public void commonLog() {
    }

    @Before("commonLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("url: " + request.getRequestURL().toString());// 访问地址
        logger.info("Method : " + request.getMethod());// 请求方式
        logger.info("IP : " + InetAddress.getLocalHost().toString().substring(InetAddress.getLocalHost().toString().lastIndexOf("/") + 1));
        logger.info("execute : " + joinPoint.getTarget().getClass().getName() + "--" + joinPoint.getSignature().getName());
        logger.info("requestkey : " + Arrays.toString(joinPoint.getArgs()));
        logger.info("token : " + request.getHeader("token"));
    }

    @AfterReturning(returning = "ret" ,value = "commonLog()")
    public void doAfterReturning(Object ret) {
        try {
            if (logger.isInfoEnabled())
                logger.info("****************{}",objectMapper.writeValueAsString(ret));
        } catch (Exception e) {
            logger.warn("{}", e.getMessage());
        }
    }
}