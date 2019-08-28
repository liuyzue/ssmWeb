package com.founder.dao;

import com.founder.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /*
    * 查询所有用户
    * */
    List<User> selectAll();

    /*
    * 通过用户名查询密码
    * */
    String findPasswordByUsername(String username);

}
