package com.example.demo.entity;

/**
 * @ClassName Father
 * @Description
 * @Author Aldrich
 * @Date 2021/3/11 22:27
 * @Version 1.0
 **/
public class Father {
    static {
        System.out.print("father的静态代码块");
    }

    public Father()
    {
        System.out.println("father的构造函数");
    }

    {
        System.out.print("father的非静态函数");
    }

    /*public void Sing() {
        System.out.print("清唱 [默认分贝] ");//L1
    }*/

}
