package com.zm.service;

import com.zm.Mapper.UserMapper;
import com.zm.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.Map;

public class UserService implements UserMapper {
    private SqlSessionTemplate sqlSession;


    @Override
    public User getUserById(Map map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserById(map);
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
}
