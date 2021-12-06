package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoolingUserRequestRepository extends JpaRepository<UserRequest,Long> {
}
