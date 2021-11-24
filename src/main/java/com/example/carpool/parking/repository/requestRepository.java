package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.request;
import org.aspectj.lang.JoinPoint;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface requestRepository extends JpaRepository<request, Long> {
}
