package com.um.services.impl;

import com.um.pojo.User;
import com.um.services.UserService;


public class UserServiceImpl implements UserService {

    public User saveUser(User user) {
        return getUser(user);
    }

    private User getUser(User user) {
        User u = new User();
        if ("a".equalsIgnoreCase(user.getName())) {
            u.setName("hello");
        } else {
            u.setName("hello world!");
        }

        System.out.println("com.um.services.impl.UserServiceImpl");
        return user;
    }
}
