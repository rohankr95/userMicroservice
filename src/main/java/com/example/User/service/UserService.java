package com.example.User.service;

import com.example.User.entity.User;

public interface UserService {
    public User get(Long id);
    public User save(User user);
    public User update(User user);
    public void delete(Long id);
}
