package com.example.demo.entity;

/**
 * @ClassName Student
 * @Description 学生实体类
 * @Author Aldrich
 * @Date 2021/3/12 12:30
 * @Version 1.0
 **/
public class Student {

    private int c_id;
    private String stu_name;
    private String stu_number;
    private String c_name;
    private String stu_phone_number;
    private String stu_create_time;
    private String status;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_number() {
        return stu_number;
    }

    public void setStu_number(String stu_number) {
        this.stu_number = stu_number;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getStu_phone_number() {
        return stu_phone_number;
    }

    public void setStu_phone_number(String stu_phone_number) {
        this.stu_phone_number = stu_phone_number;
    }

    public String getStu_create_time() {
        return stu_create_time;
    }

    public void setStu_create_time(String stu_create_time) {
        this.stu_create_time = stu_create_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
