package com.example.demo.Utils;

import java.util.Random;

/**
 * @ClassName GetRandom
 * @Description 随机数工具类
 * @Author Aldrich
 * @Date 2021/3/12 12:07
 * @Version 1.0
 **/
public class GetRandom {


    /**
     * @Author Aldrich
     * @Description 获取随机字符串
     * @Date 2021/3/12 12:10
     * @param count 规定获取几位数的字符串
     * @return
     */
    public static  String getRandom(int count){

        //元素
        int[] array = {0,1,2,3,4,5,6,7,8,9};

        //随机对象
        Random rand = new Random();

        //循环产生
        for (int i = 10; i > 1; i--) {
            int index = rand.nextInt(i);
            int tmp = array[index];
            array[index] = array[i - 1];
            array[i - 1] = tmp;
        }

        //拼接结果为字符串
        int result = 0;
        for(int i = 0; i < count; i++){
            result = result * 10 + array[i];
        }
        String sixString = Integer.toString(result);

        //有可能出现count-1位数，前面加0补全
        if (sixString.length() == count-1) {
            sixString = "0" + sixString;
        }
        return sixString;
    }


    /**
     * @Author Aldrich
     * @Description  获取随机数
     * @Date 2021/3/12 12:29
     * @param n 范围{0，n-1}
     * @return
     */
    public static int randomInt(int n){
        Random random = new Random();
        return random.nextInt(n);
    }


}
