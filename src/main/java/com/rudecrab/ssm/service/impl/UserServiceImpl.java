package com.rudecrab.ssm.service.impl;

import com.rudecrab.ssm.entity.User;
import com.rudecrab.ssm.entity.vo.UserInfoVo;
import com.rudecrab.ssm.mapper.UserAddressMapper;
import com.rudecrab.ssm.mapper.UserMapper;
import com.rudecrab.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    public int insert(User user) {
        return userMapper.add(user);
    }

    @Override
    public List<UserInfoVo> getUserAddressListByUserId(int userId) {
        return userAddressMapper.getUserAddressListByUserId(userId);
    }

}

