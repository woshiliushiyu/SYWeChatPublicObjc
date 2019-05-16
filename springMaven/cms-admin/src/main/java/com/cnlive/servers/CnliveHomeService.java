package com.cnlive.servers;

import com.cnlive.dao.CnliveHomeBean;

import java.util.List;

public interface CnliveHomeService {

    List<CnliveHomeBean> selectHomeBean();

    void insertHome(CnliveHomeBean bean);

    void updataHome(String name,Integer id);

    CnliveHomeBean selectById(Integer id);

    void delectByName(String name);
}
