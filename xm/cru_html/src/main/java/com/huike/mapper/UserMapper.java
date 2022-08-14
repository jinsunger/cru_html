package com.huike.mapper;

import com.huike.pojo.User;

import java.util.List;


public interface UserMapper {
    List<User> getUser();

    void deleteId(Integer id);

    void addUser(User user);
}
