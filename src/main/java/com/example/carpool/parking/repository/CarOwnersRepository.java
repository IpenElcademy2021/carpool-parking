package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarOwnersRepository extends JpaRepository<CarOwners, String> {

    List<CarOwners> searchByUser(User user);
}
