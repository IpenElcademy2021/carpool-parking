package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.freeParking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface leaveRepository extends JpaRepository<freeParking,Long> {
}
