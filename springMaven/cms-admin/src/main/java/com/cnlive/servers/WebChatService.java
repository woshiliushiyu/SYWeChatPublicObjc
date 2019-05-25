package com.cnlive.servers;

import java.util.Map;

public interface WebChatService {

    String parseMessage(Map<String, String> map);

    String parseEvent(Map<String, String> map);

    void insertData(int id,String content,String resName,String resType,String resImage,String resUrl,String resDesc);
}
