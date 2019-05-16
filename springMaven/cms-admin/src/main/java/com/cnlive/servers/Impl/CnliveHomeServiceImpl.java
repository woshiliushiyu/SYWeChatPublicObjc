package com.cnlive.servers.Impl;


import com.cnlive.dao.CnliveHomeBean;
import com.cnlive.mapper.CnliveHomeMapper;
import com.cnlive.servers.CnliveHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CnliveHomeServiceImpl implements CnliveHomeService {

    @Autowired
    private CnliveHomeMapper homeMapper;


    public List<CnliveHomeBean> selectHomeBean() {
        return homeMapper.selectHomeMapper();
    }

    public void insertHome(CnliveHomeBean bean) {
        homeMapper.insertHomeMapper(bean);
    }

    public void updataHome(String name,Integer id) {
        homeMapper.updateHomeMapper(name,id);
    }

    public CnliveHomeBean selectById(Integer id) {
        return homeMapper.selectBeanById(id);
    }

    public void delectByName(String name) {
        homeMapper.delectHomeByName(name);
    }


}
