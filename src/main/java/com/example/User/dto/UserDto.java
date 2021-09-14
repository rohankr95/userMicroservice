package com.example.User.dto;

import com.example.User.entity.UserOrderHistory;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;


public class UserDto {
    private Long id;
    private List<UserOrderHistoryDto> orderHistoryDto;
    private String password;
    private String userName;
    private String cartId;
    private Long userMobile;
    private String userLocation;

    public List<UserOrderHistoryDto> getOrderHistoryDto() {
        return orderHistoryDto;
    }

    public void setOrderHistoryDto(List<UserOrderHistoryDto> orderHistoryDto) {
        this.orderHistoryDto = orderHistoryDto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Long getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(Long userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }
}
