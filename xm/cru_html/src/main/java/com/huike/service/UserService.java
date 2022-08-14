package com.huike.service;

import com.huike.common.Result;
import com.huike.mapper.UserMapper;
import com.huike.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //查询所有用户
    public List<User> getAllUser() {

        return userMapper.getUser();
    }

    //根据id删除
    public void deleteById(Integer id) {
        userMapper.deleteId(id);
    }


    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
