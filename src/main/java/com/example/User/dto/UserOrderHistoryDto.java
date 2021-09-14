package com.example.User.dto;

import com.example.User.entity.User;
import com.example.User.entity.UserProductDetails;

import javax.persistence.*;
import java.util.List;

public class UserOrderHistoryDto {
    private Long id;
    private List<UserProductDetailsDto> userProductDetailsDto;
    private UserDto userDto;

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<UserProductDetailsDto> getUserProductDetailsDto() {
        return userProductDetailsDto;
    }

    public void setUserProductDetailsDto(List<UserProductDetailsDto> userProductDetailsDto) {
        this.userProductDetailsDto = userProductDetailsDto;
    }
}
