package com.hcl.simplilearn.dao;

import com.hcl.simplilearn.model.User;

public interface IUserDao {
    boolean register(User user);
    User login(String username, String password);
    boolean logout(User user);
}
