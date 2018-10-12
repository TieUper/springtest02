package com.tie.springtest02.service;
import com.tie.springtest02.base.Service;
import com.tie.springtest02.model.People;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/08.
 */
public interface PeopleService extends Service<People> {

    List<People> selectByName(String name, int age);
}
