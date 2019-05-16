package com.cnlive.mapper;

import com.cnlive.dao.CnliveHomeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CnliveHomeMapper {

    List<CnliveHomeBean> selectHomeMapper();

    CnliveHomeBean selectBeanById(@Param("id")Integer id);

    void insertHomeMapper(CnliveHomeBean bean);

    void updateHomeMapper(@Param("name")String name, @Param("id")Integer id);

    void delectHomeByName(@Param("name")String name);

}
