package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.userRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRequestRepository extends JpaRepository<userRequest, Long > {
}
