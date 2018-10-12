package com.tie.springtest02.service.impl;

import com.tie.springtest02.base.AbstractService;
import com.tie.springtest02.dao.PeopleMapper;
import com.tie.springtest02.model.People;
import com.tie.springtest02.service.PeopleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/08.
 */
@Service
@Transactional
public class PeopleServiceImpl extends AbstractService<People> implements PeopleService {
    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public List<People> selectByName(String name, int age) {
        List<People> people = peopleMapper.selectByName(name,age);
        return people;
    }
}
