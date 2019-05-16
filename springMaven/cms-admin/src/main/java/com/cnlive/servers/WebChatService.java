package com.cnlive.servers;

import java.util.Map;

public interface WebChatService {

    String parseMessage(Map<String, String> map);

    String parseEvent(Map<String, String> map);
}
