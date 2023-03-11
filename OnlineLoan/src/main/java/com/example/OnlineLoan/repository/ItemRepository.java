package com.example.OnlineLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineLoan.model.Item;




public interface ItemRepository extends JpaRepository<Item,Long> {

}
