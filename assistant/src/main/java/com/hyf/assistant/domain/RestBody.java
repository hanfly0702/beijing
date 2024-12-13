package com.hyf.assistant.domain;

import java.io.Serializable;

/**
 *
 * 统一返回体
 *
 * @author hanyufei
 * @date 2021-06-04 17:39
 * @version 1.0
 *
 */
public class RestBody<T> implements Rest<T>, Serializable {
    public static final String WX_CALLBACK_SUCCESS = "success";
    private static final long serialVersionUID = -4457708053773623264L;

    private String code = "00000";
    private T data;
    private String msg = "成功";
    private String identifier = "";

    public static Rest<?> ok() {
        return new RestBody<>();
    }

    public static Rest<?> ok(String msg) {
        Rest<?> restBody = new RestBody<>();
        restBody.setMsg(msg);
        return restBody;
    }

    public static <T> Rest<T> okData(T data) {
        Rest<T> restBody = new RestBody<>();
        restBody.setData(data);
        return restBody;
    }

    public static <T> Rest<T> okData(T data, String msg) {
        Rest<T> restBody = new RestBody<>();
        restBody.setData(data);
        restBody.setMsg(msg);
        return restBody;
    }


    public static <T> Rest<T> build(String code, T data, String msg, String identifier) {
        Rest<T> restBody = new RestBody<>();
        restBody.setCode(code);
        restBody.setData(data);
        restBody.setMsg(msg);
        restBody.setIdentifier(identifier);
        return restBody;
    }

    public static <T> Rest<T> failure(String code, String msg, T data) {
        Rest<T> restBody = new RestBody<>();
        restBody.setCode(code);
        restBody.setMsg(msg);
        restBody.setData(data);
        return restBody;
    }

    public static Rest<?> failure(String code, String msg) {
        Rest<?> restBody = new RestBody<>();
        restBody.setCode(code);
        restBody.setMsg(msg);
        return restBody;
    }

    public static <T> Rest<T> failureData(T data, String msg, String identifier) {
        Rest<T> restBody = new RestBody<>();
        restBody.setIdentifier(identifier);
        restBody.setData(data);
        restBody.setMsg(msg);
        return restBody;
    }

    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", data:" + data +
                ", msg:" + msg +
                ", identifier:" + identifier +
                '}';
    }


    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}