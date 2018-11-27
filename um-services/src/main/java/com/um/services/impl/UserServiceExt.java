package com.um.services.impl;

import com.um.pojo.User;
import com.um.services.UserService;

/**
 * @program: um
 * @description: Demo
 * @author: Administrator
 * @create: 2018-11-27 16:39
 **/
public class UserServiceExt implements UserService {

    @Override
    public User saveUser(User user) {
        return new User();
    }
}
