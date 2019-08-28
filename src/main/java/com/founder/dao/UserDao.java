package com.founder.dao;

import com.founder.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> selectAll();

    String findPasswordByUsername(String username);

}
