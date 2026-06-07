package com.wipro.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.healthcare.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
