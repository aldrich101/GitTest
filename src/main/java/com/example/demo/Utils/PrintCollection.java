package com.example.demo.Utils;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @ClassName PrintCollection
 * @Description
 * @Author Aldrich
 * @Date 2021/3/14 21:03
 * @Version 1.0
 **/
public class PrintCollection {



    /**
     * @Author Aldrich
     * @Description  测试HashSet的增删改查
     * @Date 2021/3/14 21:21
     * @param
     * @return
     */
    public static void TestHashSet()
    {
        HashSet hs = new HashSet();
        //增加

        HashSet s =new HashSet();

        s.add("雨");
        s.add("暴风");

        hs.addAll(s);
        hs.add("剑雨");
        hs.add("冰");
        hs.add("旱");

        PrintCollection.printHashSet(hs);

        //删除
        hs.remove("旱");
        hs.removeAll(s);
        PrintCollection.printHashSet(hs);

        //修改
        hs.add("han");
        PrintCollection.printHashSet(hs);

        //添加重复值
        hs.add("101");
        hs.add("101");
        hs.add("101");
        PrintCollection.printHashSet(hs);

        //添加空值
        hs.add("");
        hs.add("");
        hs.add("");
        PrintCollection.printHashSet(hs);
    }




    /**
     * @Author Aldrich
     * @Description for each打印Set集合
     * @Date 2021/3/14 21:20
     * @param set
     * @return
     */
    public static void printHashSet(HashSet set)
    {

        StringBuilder stringBuilder = new StringBuilder();
        for (Object string : set)
        {
            stringBuilder.append(string).append(" ").append(" ");
        }

        System.out.println(stringBuilder);


        /*TreeSet ts=new TreeSet();
        ts.add("1春");
        ts.add("2夏");
        ts.add("3秋");
        ts.add("4冬");
        System.out.println(ts);

        //显示第一个
        System.out.println(ts.first());

        //显示最后一个
        System.out.println(ts.last());

        System.out.println(ts.subSet("2夏","4冬"));

        //删除
        ts.remove("4冬");
        System.out.println(ts);*/

    }


    public static void main(String[] args) {


    }


}
