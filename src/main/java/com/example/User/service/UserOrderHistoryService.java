package com.example.User.service;

import com.example.User.entity.UserOrderHistory;

public interface UserOrderHistoryService {

    public UserOrderHistory get(Long id);
    public UserOrderHistory save(UserOrderHistory userOrderHistory);
    public void delete(Long id);
}
