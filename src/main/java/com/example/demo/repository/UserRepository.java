package com.example.demo.repository;


import com.example.demo.dto.UserDto;
import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Users, Integer> {
    Users findByUsername(String username);



}
