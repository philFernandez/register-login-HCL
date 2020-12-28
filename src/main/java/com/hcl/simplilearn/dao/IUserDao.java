package com.hcl.simplilearn.dao;

import com.hcl.simplilearn.model.User;

public interface IUserDao {
    boolean register(User user);
    boolean login(User user);
    boolean logout(User user);
}
