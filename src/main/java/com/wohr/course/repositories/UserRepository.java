package com.wohr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wohr.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
