package com.example.demo;

import com.example.demo.Utils.GetRandom;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Father;
import com.example.demo.entity.Son;
import com.example.demo.service.CollegeService;
import com.example.demo.service.Impl.CollegeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Timer;

@SpringBootApplication
public class DemoApplication {

    //全局常量
    public static final double PI=3.14;





    public static void main(String[] args) {

        String random = GetRandom.getRandom(1);
        System.out.println(random);


    }


   

}
