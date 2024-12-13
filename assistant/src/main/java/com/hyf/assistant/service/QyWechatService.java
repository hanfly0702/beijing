package com.hyf.assistant.service;

import com.hyf.assistant.domain.SendRequest;

public interface QyWechatService {

    void  submittedWorkRemind();

    void  submittedWorkRemind(SendRequest sendRequest);
}
