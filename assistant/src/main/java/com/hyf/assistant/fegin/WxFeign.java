package com.hyf.assistant.fegin;

import com.hyf.assistant.domain.SendRequest;
import com.hyf.assistant.domain.WechatResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="qyWechat",url="https://qyapi.weixin.qq.com/")
public interface WxFeign {

    @PostMapping(value="/cgi-bin/webhook/send")
    WechatResponse send(@RequestParam String key, @RequestBody SendRequest request);
    @PostMapping(value="/cgi-bin/webhook/send?key=7a88d5bc-a558-4312-9ce1-da5d9667ee01")
    WechatResponse send(@RequestBody SendRequest request);

}
