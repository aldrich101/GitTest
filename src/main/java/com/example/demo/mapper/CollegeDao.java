package com.example.demo.mapper;

import com.example.demo.entity.College;
import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceClassName ColleageDao
 * @Description
 * @Author Aldrich
 * @Date 2021/3/12 20:16
 * @Version 1.0
 **/
@Mapper
public interface CollegeDao {


      int insert(College college);


}
