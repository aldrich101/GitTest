package com.example.demo.entity;

import java.util.Date;

/**
 * @ClassName College
 * @Description 学院实体类
 * @Author Aldrich
 * @Date 2021/3/12 12:30
 * @Version 1.0
 **/
public class College {

    private int cId;
    private String cName;
    private String cAddress;
    private String cPhoneNumber;
    private Date cCreateTime;



    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcPhoneNumber() {
        return cPhoneNumber;
    }

    public void setcPhoneNumber(String cPhoneNumber) {
        this.cPhoneNumber = cPhoneNumber;
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }
}
