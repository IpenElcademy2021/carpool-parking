package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, String> {
}
