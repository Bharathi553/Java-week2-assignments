package com.example.week2.task1.repository;

import com.example.week2.task1.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
