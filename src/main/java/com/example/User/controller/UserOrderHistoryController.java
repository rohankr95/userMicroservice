package com.example.User.controller;

import com.example.User.entity.User;
import com.example.User.entity.UserOrderHistory;
import com.example.User.repository.UserOrderHistoryRepository;
import com.example.User.repository.UserRepository;
import com.example.User.service.UserOrderHistoryService;
import com.example.User.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/project/order")
public class UserOrderHistoryController {

    @Autowired
    UserOrderHistoryService userOrderHistoryService;
    @Autowired
    UserRepository userRepository;
    @GetMapping(value="/{id}")
    public UserOrderHistory get(@PathVariable(name = "id") Long id){
        return userOrderHistoryService.get(id);
    }
    @PostMapping
    public UserOrderHistory save(@RequestBody UserOrderHistory userOrderHistory){
        System.out.println(userOrderHistory);
        return userOrderHistoryService.save(userOrderHistory);
    }
    @DeleteMapping
    public void delete(@RequestParam Long id){
        userOrderHistoryService.delete(id);
    }
}
