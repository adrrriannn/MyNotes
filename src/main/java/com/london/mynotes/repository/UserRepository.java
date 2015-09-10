package com.london.mynotes.repository;

/**
 *
 * @author adrián
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.london.mynotes.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserName(String username);
}