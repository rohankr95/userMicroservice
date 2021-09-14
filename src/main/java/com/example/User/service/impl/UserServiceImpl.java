package com.example.User.service.impl;

import com.example.User.entity.User;
import com.example.User.repository.UserRepository;
import com.example.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User get(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        Long newId = user.getId();
        User userN = userRepository.findById(newId).get();
        if(user!=null){
            if(user.getUserName()!=null){
                userN.setUserName(user.getUserName());
            }
            else if(user.getUserMobile()!=null) {
                userN.setUserMobile(user.getUserMobile());
            }
            else if(user.getUserLocation()!=null){
                userN.setUserLocation(user.getUserLocation());
            }
        }else {
            System.out.println("The object doesn't exist");
            return null;
        }
        return userRepository.save(userN);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
