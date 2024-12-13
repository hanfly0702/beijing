package com.hyf.assistant.service.impl;

import com.hyf.assistant.domain.text;
import com.hyf.assistant.fegin.WxFeign;
import com.hyf.assistant.domain.SendRequest;
import com.hyf.assistant.service.QyWechatService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QyWechatServiceImpl implements QyWechatService {

    @Resource
    private WxFeign wxFeign;

    @Value("${qyapi.key}")
    private String key;

    @Override
    public void submittedWorkRemind() {

        SendRequest sendRequest = new SendRequest();
        sendRequest.setMsgType("text");

        text te = new text();
        te.setContent("这时一条测试");
        te.setMentionedMobileList(new String[]{"@all"});
        sendRequest.setText(te);
        wxFeign.send(key, sendRequest);

    }

    @Override
    public void submittedWorkRemind(SendRequest sendRequest) {

    }
}
