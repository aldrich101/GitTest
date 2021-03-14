package com.example.demo.Utils;

/**
 * @ClassName DecideValue
 * @Description
 * @Author Aldrich
 * @Date 2021/3/14 10:18
 * @Version 1.0
 **/
public class DecideValue {

    public static String equalsValue()
    {
        //基本数据类型的变量比较
        int a = 10;
        int b = 20;
        System.out.println(a==b);


        //引用类型的变量比较
        DecideValue c = new DecideValue();
        DecideValue d = new DecideValue();

        System.out.println(c==d);
        System.out.println(c.equals(d));

        //包装类型数据的比较

        //第一种情况，包装类和基本数据类型比较
        Integer e = 21;
        int f = 21;
        if (e == f) { //自动拆箱
            System.out.println("a == b yes");
        } else {
            System.out.println("a == b no");
        }

        if (e.equals(f)) { //自动装箱
            System.out.println("a.equals(b) yes");
        }
        if (e.intValue() == f) {
            System.out.println("a.intValue() == b.intValue() yes");
        }

        //第二种情况，包装类和包装类的比较
        Integer g = 100, h = 100;
        Integer j = 700, k = 700;

        System.out.println(g == h);
        System.out.println(j == k);

        return "";
    }

    public static void main(String[] args) {
        //DecideValue.equalsValue();

        Integer a = 100;
        System.out.println(a.hashCode());

        Integer b = 99;

        System.out.println(Integer.valueOf(a));

        System.out.println(a.hashCode());

        System.out.println(b.hashCode());
    }
}
