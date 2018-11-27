package com.um.control;

import com.um.pojo.User;
import com.um.services.UserService;
import com.um.services.impl.UserServiceImpl;

public class UserContronl {

    public User saveUser(User user) {
        UserService userService = new UserServiceImpl();
        return userService.saveUser(user);
    }
}
