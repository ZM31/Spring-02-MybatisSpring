package com.zm.mapper;

import com.zm.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    //根据用户名 或 角色 查询用户总数
    int getUserCounts(Map map);
}
