package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.CarOwners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOwnersRepository extends JpaRepository<CarOwners, String> {
}
