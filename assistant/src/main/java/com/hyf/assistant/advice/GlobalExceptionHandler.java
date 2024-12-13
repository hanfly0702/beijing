package com.hyf.assistant.advice;


import com.hyf.assistant.domain.Rest;
import com.hyf.assistant.domain.RestBody;
import com.hyf.assistant.domain.SendRequest;
import com.hyf.assistant.domain.text;
import com.hyf.assistant.fegin.WxFeign;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 统一异常处理
 *
 * @author hanyufei
 * @version 1.0
 * @date 2021-06-09 11:19
 */
@RestControllerAdvice
@ConditionalOnProperty(name = "GlobalExceptionHandler",havingValue = "true", matchIfMissing = false)
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Resource
    private WxFeign wxFeign;

    @ExceptionHandler(NullPointerException.class)
    public Rest<?> nullPointerExceptionExceptionHandler(NullPointerException e) {
        //封装异常消息
       // SendRequest sendRequest = getSendRequest(e);
        //发送消息
        //wxFeign.send(sendRequest);
        return RestBody.failure("999999999", "系统异常");
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public Rest<?> processDefaultException(Exception e) {

        //封装异常消息
     //   SendRequest sendRequest = getSendRequest(e);
        //发送消息
       // wxFeign.send(sendRequest);
        return RestBody.failure("999999999", "系统异常");
    }

    /**
     * 封装要发送异常消息
     * @param e 异常对象
     * @return  异常消息
     */
    private SendRequest getSendRequest(Exception e) {
        SendRequest sendRequest = new SendRequest();
        sendRequest.setMsgType("text");
        text te = new text();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        te.setContent("程序发生异常，报错信息为："+sw.toString());
        te.setMentionedMobileList(new String[]{"@all"});
        sendRequest.setText(te);
        return sendRequest;
    }


}