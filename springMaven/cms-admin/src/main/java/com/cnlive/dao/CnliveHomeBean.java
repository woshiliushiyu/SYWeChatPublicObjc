package com.cnlive.dao;

import lombok.Data;

import java.io.Serializable;

@Data
public class CnliveHomeBean implements Serializable {

    private Integer id;
    private String name;
    private String pwd;
    private String sex;
    private String home;
    private String info;
}
