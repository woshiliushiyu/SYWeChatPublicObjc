package com.cnlive.dao.outputMessage;

import com.cnlive.util.ResponseMessageType;

public class TextMessage extends BaseOutputMessage {

    // 文本消息
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String getMsgType() {
        return ResponseMessageType.RESP_MESSAGE_TYPE_TEXT.toString();
    }
}
