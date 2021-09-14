package com.example.User.controller;

import com.example.User.dto.LoginDto;
import com.example.User.entity.User;
import com.example.User.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/user/register")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    RestTemplate restTemplate=new RestTemplate();
    @Autowired
    KafkaTemplate<String,Object>template;

    @GetMapping(value="/{id}")
    public User get(@PathVariable(name = "id") Long id){
        return userService.get(id);
    }
    @PostMapping
    public User save(@RequestBody User user){
        LoginDto loginDto = new LoginDto();
        loginDto.setUserName(user.getUserName());
        loginDto.setUserPassword(user.getPassword());
        HttpEntity<LoginDto> request = new HttpEntity<>(loginDto);
        LoginDto loginDto1 = restTemplate.postForObject("http://localhost:8084/user/register",request,LoginDto.class);
        User savedUser=userService.save(user);
        template.send("product",user);
        return savedUser;
    }
    @PutMapping(value="/update")
    public User update(@RequestBody User user){

        return userService.update(user);
    }
    @DeleteMapping
    public void delete(@RequestParam Long id){
        userService.delete(id);
    }
}
