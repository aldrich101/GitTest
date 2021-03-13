package com.example.demo.entity;

/**
 * @ClassName Son
 * @Description
 * @Author Aldrich
 * @Date 2021/3/11 22:28
 * @Version 1.0
 **/
public class Son extends Father{



    static {
        System.out.print("son的静态代码块");
    }

    public Son()
    {
        System.out.println("son的构造函数");
    }

    {
        System.out.print("son的函数");
    }


    public void get()
    {
        System.out.println("子类方法");
        System.out.println("\n");
    }

    public void Sing() {
        System.out.print("女生清唱 [默认分贝] ");//L3
    }


}
