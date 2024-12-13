package com.hyf.assistant.domain;

/**
 *
 * 统一返回体
 *
 * @author hanyufei
 * @date 2021-06-04 17:39
 * @version 1.0
 */
public interface Rest<T> {
    /**
     * 业务状态码，设计时应该区别于http状态码.
     *
     * @param code the code
     */
    void setCode(String code);

    /**
     * 数据载体.
     *
     * @param data the data
     */
    void setData(T data);

    /**
     * 提示信息.
     *
     * @param msg the msg
     */
    void setMsg(String msg);

    /**
     * 预留的标识位，作为一些业务的处理标识.
     *
     * @param identifier 标识
     */
    void setIdentifier(String identifier);
}
