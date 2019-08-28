package com.founder.service.impl;

import com.founder.dao.UserDao;
import com.founder.entity.User;
import com.founder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/8/27
 * @time:18:10
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public String findPasswordByUsername(String username) {
        return userDao.findPasswordByUsername(username);
    }
}
