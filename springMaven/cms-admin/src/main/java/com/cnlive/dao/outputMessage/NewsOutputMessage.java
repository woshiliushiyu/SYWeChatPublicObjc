package com.cnlive.dao.outputMessage;

import com.cnlive.util.ResponseMessageType;
import lombok.Data;

import java.util.List;

@Data
public class NewsOutputMessage extends BaseOutputMessage {

    // 图文消息个数，限制为10条以内
    private int ArticleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Articles> Articles;

    @Override
    public String getMsgType() {
        return ResponseMessageType.RESP_MESSAGE_TYPE_NEWS.toString();
    }
}
