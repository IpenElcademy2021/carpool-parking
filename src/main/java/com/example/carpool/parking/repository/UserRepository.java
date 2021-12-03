package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByVisaAndPassword(String visa, String password);


}
