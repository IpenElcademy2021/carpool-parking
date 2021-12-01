package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoolRequestRepository extends JpaRepository<UserRequest, Long> {

    @Query("from UserRequest ur join fetch ur.pooling p where p.user.visa = ?1")
    List<UserRequest> findUserRequestByVisa(String visa);
}
