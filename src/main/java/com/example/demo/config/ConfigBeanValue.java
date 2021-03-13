package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName ConfigBeanValue
 * @Description
 * @Author Aldrich
 * @Date 2021/3/12 21:28
 * @Version 1.0
 **/
@Component
@PropertySource(value = {"classpath:application.properties"})
public class ConfigBeanValue {

    @Value("${demo.name}")
    public String name;

    @Value("${demo.age}")
    public String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
