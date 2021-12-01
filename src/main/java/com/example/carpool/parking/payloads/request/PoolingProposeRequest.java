package com.example.carpool.parking.payloads.request;

import com.example.carpool.parking.entities.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class PoolingProposeRequest {

    private @Getter @Setter Date date;
    private @Getter @Setter String region;
    private @Getter @Setter String pickUpPoint;
    private @Getter @Setter String pickUpTime;
    private @Getter @Setter String departureTime;
    private @Getter @Setter int seat;
    private @Getter @Setter User user;
}
