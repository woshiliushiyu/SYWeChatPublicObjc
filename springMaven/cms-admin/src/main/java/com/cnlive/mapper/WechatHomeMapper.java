package com.cnlive.mapper;

import com.cnlive.dao.WechatHomeBean;
import org.springframework.stereotype.Repository;

@Repository
public interface WechatHomeMapper {

    WechatHomeBean selectByContent(String name);
}
