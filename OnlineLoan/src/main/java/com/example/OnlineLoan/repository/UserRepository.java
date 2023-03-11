package com.example.OnlineLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineLoan.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
