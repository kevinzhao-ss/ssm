package com.rudecrab.ssm.service.impl;

import com.rudecrab.ssm.controller.UserController;
import com.rudecrab.ssm.entity.User;
import com.rudecrab.ssm.mapper.UserMapper;
import com.rudecrab.ssm.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    private static final Log logger = LogFactory.getLog(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    // TODO 维持结构，将判断逻辑从controller移动到此函数
    public int insert(User user) {
        if (user.getName() == null || user.getId() == null || user.getPassword() == null)
        {
            logger.error("add fail params is null!");
            return 0;
        }

        if ("".equals(user.getName())
                || user.getId() == 0L
                || "".equals(user.getPassword())) {
            // TODO 日志如何格式化输出？ eg:logger.info("fail %s", user.getName()) or logger.info("fail ", user.getName())
            logger.info(user);
            return 0;
        } else {
            logger.info("add secuess!");
            return userMapper.add(user);
        }
    }
}

