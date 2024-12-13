package com.hyf.assistant.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class text {

    private String content;

    @JsonProperty("mentioned_mobile_list")
    private String[] mentionedMobileList;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getMentionedMobileList() {
        return mentionedMobileList;
    }

    public void setMentionedMobileList(String[] mentionedMobileList) {
        this.mentionedMobileList = mentionedMobileList;
    }

    @Override
    public String toString() {
        return "text{" +
                "content='" + content + '\'' +
                ", mentioned_mobile_list=" + Arrays.toString(mentionedMobileList) +
                '}';
    }
}
