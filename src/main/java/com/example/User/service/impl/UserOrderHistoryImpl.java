package com.example.User.service.impl;

import com.example.User.entity.UserOrderHistory;
import com.example.User.repository.UserOrderHistoryRepository;
import com.example.User.service.UserOrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOrderHistoryImpl implements UserOrderHistoryService {
    @Autowired
    UserOrderHistoryRepository userOrderHistoryRepository;

    @Override
    public UserOrderHistory get(Long id) {
        return userOrderHistoryRepository.findById(id).get();
    }

    @Override
    public UserOrderHistory save(UserOrderHistory userOrderHistory) {
        return userOrderHistoryRepository.save(userOrderHistory);
    }

    @Override
    public void delete(Long id) {
        userOrderHistoryRepository.deleteById(id);
    }
}
