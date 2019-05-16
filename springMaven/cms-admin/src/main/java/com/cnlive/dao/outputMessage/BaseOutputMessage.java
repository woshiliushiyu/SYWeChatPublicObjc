package com.cnlive.dao.outputMessage;

import lombok.Data;

@Data
public abstract class BaseOutputMessage {

    // 接收方帐号（收到的OpenID）
    private String ToUserName;
    // 开发者微信号
    private String FromUserName;
    // 消息创建时间 （整型）
    private long CreateTime;

    // 获取消息类型
    public abstract String getMsgType();
}
