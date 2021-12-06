package com.example.carpool.parking.payloads.request;


import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.User;
import lombok.Getter;
import lombok.Setter;

public class PoolingUserRequest {

    private @Getter @Setter String reservationStatus;
    private @Getter @Setter String comment;
    private @Getter @Setter User user;
    private @Getter @Setter Pooling pooling;
}
