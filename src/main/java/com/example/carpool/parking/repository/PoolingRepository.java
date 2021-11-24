package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.Pooling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoolingRepository extends JpaRepository<Pooling, Long> {
}
