package com.hyf.assistant.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendRequest extends WechatRequest {

    @JsonProperty("msgtype")
    private String msgType;

    @JsonProperty("text")
    private text text;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public com.hyf.assistant.domain.text getText() {
        return text;
    }

    public void setText(com.hyf.assistant.domain.text text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SendRequest{" +
                "msgtype='" + msgType + '\'' +
                ", text=" + text +
                '}';
    }
}


