package com.example.User.dto;

import com.example.User.entity.UserOrderHistory;

import javax.persistence.*;

public class UserProductDetailsDto {

    private Long id;
    private String pName;
    private Long quantity;
    private Double price;
    UserOrderHistoryDto userOrderHistoryDto;

    public UserOrderHistoryDto getUserOrderHistoryDto() {
        return userOrderHistoryDto;
    }

    public void setUserOrderHistoryDto(UserOrderHistoryDto userOrderHistoryDto) {
        this.userOrderHistoryDto = userOrderHistoryDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
