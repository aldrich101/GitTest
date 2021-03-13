package com.example.demo.entity;

import com.example.demo.DemoApplication;
import org.springframework.boot.SpringApplication;

/**
 * @ClassName Order
 * @Description
 * @Author Aldrich
 * @Date 2021/3/11 16:54
 * @Version 1.0
 **/
public class Order {
    private int id;
    private String orderId;
    private String orderName;
    private String createTime;
    private Byte orderStatus;
    static int arr[] = new int[10];

    @Override
    public String toString() {
        StringBuilder infos = new StringBuilder();
        infos.append("ID:").append(this.id);
        infos.append("订单号:").append(this.orderId);
        infos.append("姓名:").append(this.orderName);
        infos.append("创建时间:").append(this.createTime);
        infos.append("状态:").append(this.orderStatus);
        return infos.toString();
    }


    public void add(int a){}

    public void add(long a){}

    public int add(double b){
        return 1;
    }

    public static void main(String[] args) {
         System.out.println(arr[0]);

    }
}
