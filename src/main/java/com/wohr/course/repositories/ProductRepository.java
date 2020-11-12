package com.wohr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wohr.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
