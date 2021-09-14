package com.example.User.entity;

import javax.persistence.*;

@Entity
@Table
public class UserProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pName;
    private Long quantity;
    private Double price;
    @ManyToOne
    @JoinColumn(name="pid")
    UserOrderHistory userOrderHistory;

    public UserOrderHistory getUserOrderHistory() {
        return userOrderHistory;
    }

    public void setUserOrderHistory(UserOrderHistory userOrderHistory) {
        this.userOrderHistory = userOrderHistory;
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
