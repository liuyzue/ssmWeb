package com.founder.service.impl;

import com.founder.dao.UserDao;
import com.founder.entity.User;
import com.founder.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private static Logger logger= LogManager.getLogger(TestServiceImpl.class);

    @Autowired
    UserDao ud;

    @Override
    public List<User> selectAll() {
        List<User> ls = ud.selectAll();
        return ls;
    }


}
