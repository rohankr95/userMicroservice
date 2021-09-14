package com.example.User.service;

import com.example.User.entity.UserProductDetails;

public interface UserProductDetailsService {

    public UserProductDetails get(Long id);
    public UserProductDetails save(UserProductDetails userProductDetails);
    public void delete(Long id);
}
