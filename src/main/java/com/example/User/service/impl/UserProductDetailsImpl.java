package com.example.User.service.impl;

import com.example.User.entity.UserProductDetails;
import com.example.User.repository.UserProductDetailsRepository;
import com.example.User.service.UserProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProductDetailsImpl implements UserProductDetailsService {
    @Autowired
    UserProductDetailsRepository userProductDetailsRepository;

    @Override
    public UserProductDetails get(Long id) {
        return userProductDetailsRepository.findById(id).get();
    }

    @Override
    public UserProductDetails save(UserProductDetails userProductDetails) {
        return userProductDetailsRepository.save(userProductDetails);
    }

    @Override
    public void delete(Long id) {
       userProductDetailsRepository.deleteById(id);
    }
}
