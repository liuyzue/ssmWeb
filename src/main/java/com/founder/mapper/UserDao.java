package com.founder.mapper;

import com.founder.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> selectAll();

    void delete();

    void insert(User user);

}
