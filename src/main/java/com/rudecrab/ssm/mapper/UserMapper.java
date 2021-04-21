package com.rudecrab.ssm.mapper;

import com.rudecrab.ssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 从数据库中查询出所有的User对象
     * @return User对象集合
     */
    List<User> selectAll();

    /**
     * 像数据库中插入一条数据
     * @return 受影响的条数
     */
    int add(User user);
}
