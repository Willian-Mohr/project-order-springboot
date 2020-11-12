package com.wohr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wohr.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
