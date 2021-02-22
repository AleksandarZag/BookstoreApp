package com.example.bookstore.Brcko.repository;

import com.example.bookstore.Brcko.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
