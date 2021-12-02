package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PoolingRepository extends JpaRepository<Pooling, Long> {

    @Query("from UserRequest ur join fetch ur.pooling p where ur.user.visa = :visa")
    List<UserRequest> findUserRequestByVisa(@Param("visa") String visa);
}
