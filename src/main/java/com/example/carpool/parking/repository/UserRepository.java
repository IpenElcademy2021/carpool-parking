package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
