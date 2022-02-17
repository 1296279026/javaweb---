package com.cm.dao;

import com.cm.entity.User;

public interface UserDao {
    //登录
    public User chekLogin(String username, String password);
}
