package com.cnlive.dao;

import lombok.Data;

@Data
public class WechatHomeBean {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    public String getResImage() {
        return resImage;
    }

    public void setResImage(String resImage) {
        this.resImage = resImage;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    private Integer id;

    private String content;

    private String resName;

    private String resDesc;

    private String resImage;

    private String resUrl;

    private String resType;


    @Override
    public String toString() {
        return "WechatHomeBean{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", resName='" + resName + '\'' +
                ", resDesc='" + resDesc + '\'' +
                ", resImage='" + resImage + '\'' +
                ", resUrl='" + resUrl + '\'' +
                ", resType='" + resType + '\'' +
                '}';
    }


}
