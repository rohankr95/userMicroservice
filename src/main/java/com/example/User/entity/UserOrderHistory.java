package com.example.User.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class UserOrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade= {CascadeType.ALL})
    @JoinColumn(name="pid")
    private List<UserProductDetails> userProductDetails;
    @ManyToOne
    @JoinColumn(name="uid")
    private User user;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public List<UserProductDetails> getUserProductDetails() {
        return userProductDetails;
    }

    public void setUserProductDetails(List<UserProductDetails> userProductDetails) {
        this.userProductDetails = userProductDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
