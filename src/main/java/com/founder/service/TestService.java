package com.founder.service;

import com.founder.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.List;

public interface TestService {


    List<User> selectAll();
}
