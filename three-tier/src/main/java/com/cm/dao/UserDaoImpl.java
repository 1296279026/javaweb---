package com.cm.dao;

import com.cm.entity.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User findUser() {

        return new User(001, "zs", "123", "中国");

    }
}
