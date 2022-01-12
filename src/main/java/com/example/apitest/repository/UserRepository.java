package com.example.apitest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apitest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(long id);
    List<User> findByNomContaining(String nom);
}
