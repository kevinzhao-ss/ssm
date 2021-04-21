package com.rudecrab.ssm.service;

import com.rudecrab.ssm.entity.User;
import com.rudecrab.ssm.entity.vo.UserInfoVo;

import java.util.List;

public interface UserService {
    /**
     * 从数据库中查询出所有的User对象
     * @return User对象集合
     */
    List<User> getAll();

    /**
     * 向数据库中插入一条新数据
     * @return 受影响的条数
     */
    int insert(User user);

    /**
     * 根据用户id查询用户地址信息集合
     * @return
     */
    List<UserInfoVo> getUserAddressListByUserId(int userId);
}
