package com.tie.springtest02.dao;

import com.tie.springtest02.base.Mapper;
import com.tie.springtest02.model.People;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PeopleMapper extends Mapper<People> {

    List<People> selectByName(@Param("name") String name, @Param("age") int age);
}