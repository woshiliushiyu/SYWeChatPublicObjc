package com.cnlive.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class XmlUtil {

    private static final String PREFIX_XML = "<xml>";

    private static final String SUFFIX_XML = "</xml>";

    private static final String PREFIX_CDATA = "<![CDATA[";

    private static final String SUFFIX_CDATA = "]]>";

    /**
     * 转化成xml, 单层无嵌套
     *
     * @param isAddCDATA  ture 加CDATA标签  false 不加CDATA标签
     * @return
     */
    public static String xmlFormat(Map<String, String> parm, boolean isAddCDATA) {

        StringBuffer strbuff = new StringBuffer(PREFIX_XML);
        if (CollectionUtil.isNotEmpty(parm)) {
            for (Map.Entry<String, String> entry : parm.entrySet()) {
                strbuff.append("<").append(entry.getKey()).append(">");
                if (isAddCDATA) {
                    strbuff.append(PREFIX_CDATA);
                    if (StringUtil.isNotEmpty(entry.getValue())) {
                        strbuff.append(entry.getValue());
                    }
                    strbuff.append(SUFFIX_CDATA);
                } else {
                    if (StringUtil.isNotEmpty(entry.getValue())) {
                        strbuff.append(entry.getValue());
                    }
                }
                strbuff.append("</").append(entry.getKey()).append(">");
            }
        }
        return strbuff.append(SUFFIX_XML).toString();
    }

    /**
     * 解析xml 解析多层 xml
     *
     * @param xml
     * @return
     * @throws XmlPullParserException
     * @throws IOException
     */
//    public static Map<String, String> xmlParse(String xml) throws XmlPullParserException, IOException {
//        Map<String, String> map = null;
//        if (StringUtil.isNotEmpty(xml)) {
//            InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
//            XmlPullParser pullParser = XmlPullParserFactory.newInstance().newPullParser();
//            pullParser.setInput(inputStream, "UTF-8"); // 为xml设置要解析的xml数据
//            int eventType = pullParser.getEventType();
//
//            while (eventType != XmlPullParser.END_DOCUMENT) {
//                switch (eventType) {
//                    case XmlPullParser.START_DOCUMENT:
//                        map = new HashMap<String, String>();
//                        break;
//                    case XmlPullParser.START_TAG:
//                        String key = pullParser.getName();
//                        if (key.equals("xml"))
//                            break;
//                        String value = pullParser.nextText().trim();
//                        map.put(key, value);
//                        break;
//                    case XmlPullParser.END_TAG:
//                        break;
//                }
//                eventType = pullParser.next();
//            }
//        }
//        return map;
//    }
}
