package com.huike.controller;


import com.huike.common.Result;
import com.huike.pojo.User;
import com.huike.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    @ResponseBody
    public Result<User> getAllUser() {
        List<User> userResult = userService.getAllUser();
        System.out.println(userResult);
        return new Result<>(userResult);
    }

    @RequestMapping("add")
    public void addUser(User user) {

        userService.addUser(user);
    }

    @RequestMapping("delete/id")
    public void deleteId(@PathVariable("id") Integer id) {
        System.out.println(id);
        userService.deleteById(id);
    }

}
