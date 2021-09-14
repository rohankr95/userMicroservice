package com.example.User.repository;

import com.example.User.entity.UserOrderHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserOrderHistoryRepository extends CrudRepository<UserOrderHistory , Long> {
}
