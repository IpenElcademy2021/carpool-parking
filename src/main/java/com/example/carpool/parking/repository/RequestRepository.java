package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RequestRepository extends JpaRepository<Request, Long> {

}
