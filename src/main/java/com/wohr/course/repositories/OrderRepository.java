package com.wohr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wohr.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
