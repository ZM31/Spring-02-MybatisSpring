package com.zm.service;

import com.zm.mapper.UserMapper;
import com.zm.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class UserService extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public List<User> getUserList() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUserList();
    }

    @Override
    public int getUserCounts(Map map) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUserCounts(map);
    }
}
