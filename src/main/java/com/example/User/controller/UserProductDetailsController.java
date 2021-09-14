package com.example.User.controller;

import com.example.User.entity.User;
import com.example.User.entity.UserOrderHistory;
import com.example.User.service.UserOrderHistoryService;
import com.example.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="project/order/product")
public class UserProductDetailsController {
    @Autowired
    UserOrderHistoryService userOrderHistoryService;
    @GetMapping(value="/{id}")
    public UserOrderHistory get(@PathVariable(name = "id") Long id){
        return userOrderHistoryService.get(id);
    }
    @PostMapping
    public UserOrderHistory save(@RequestBody UserOrderHistory userOrderHistory){
        return userOrderHistoryService.save(userOrderHistory);
    }
    @DeleteMapping
    public void delete(@RequestParam Long id){
        userOrderHistoryService.delete(id);
    }
}
