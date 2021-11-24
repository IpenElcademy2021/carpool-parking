package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.CarOwners;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarOwnersRepository extends JpaRepository<CarOwners, String> {
}
