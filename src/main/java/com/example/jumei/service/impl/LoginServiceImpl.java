package com.example.jumei.service.impl;

import com.example.jumei.entity.User;
import com.example.jumei.mapper.UserMapper;
import com.example.jumei.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: 侯家领
 * Date: 2022-06-12 16:12
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login() {
        User user = userMapper.selectById("1");
        return false;
    }
}
