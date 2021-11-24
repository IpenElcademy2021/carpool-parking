package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.carOwners;
import org.springframework.data.jpa.repository.JpaRepository;

public interface carOwnersRepository extends JpaRepository<carOwners, String> {
}
