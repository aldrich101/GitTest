package com.example.demo.service.Impl;

import com.example.demo.config.ConfigBeanValue;
import com.example.demo.entity.College;
import com.example.demo.mapper.CollegeDao;
import com.example.demo.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.Date;

import static com.example.demo.Utils.GetRandom.getRandom;
import static com.example.demo.Utils.GetRandom.randomInt;

/**
 * @ClassName CollegeServiceImpl
 * @Description
 * @Author Aldrich
 * @Date 2021/3/12 20:24
 * @Version 1.0
 **/
@Service("CollegeService")
public class CollegeServiceImpl implements CollegeService {

    @Resource
    private CollegeDao collegeDao;

    @Resource
    private ConfigBeanValue configBeanValue;


    @Override
    public int insert(College college) {
        return 0;
    }


    public String insertBatch() {
        int count = 0;
        Long start = System.currentTimeMillis();

        System.out.println(configBeanValue.getAge());
        System.out.println(configBeanValue.getName());




        /*for (int i = 0; i < collegeNames.length; i++) {
            College college = new College();
            college.setcName(collegeNames[i]);


            //随机生成手机号
            college.setcPhoneNumber(phoneNumberStarts[randomInt(phoneNumberStarts.length)] + getRandom(8));
            college.setcAddress(address[randomInt(address.length)]);
            college.setcCreateTime(new Date());

            int insert = collegeDao.insert(college);
            count += insert;
        }*/
        Long end = System.currentTimeMillis();

        Long time = end - start;

        StringBuilder info = new StringBuilder();
        info.append("time:").append("\n").append(time);
        info.append("size:").append("\n").append(count);

        return info+"";

    }

}
