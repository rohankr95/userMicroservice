package com.example.User.repository;

import com.example.User.entity.UserOrderHistory;
import com.example.User.entity.UserProductDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserProductDetailsRepository extends CrudRepository<UserProductDetails,Long> {
}
