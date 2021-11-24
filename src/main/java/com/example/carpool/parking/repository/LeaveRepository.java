package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.FreeParking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<FreeParking,Long> {
}
