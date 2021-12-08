package com.example.carpool.parking.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserRequest {

    @Id
    @GeneratedValue
    private @Getter @Setter Long userRequestId;
    private @Getter @Setter String reservationStatus;
    private @Getter @Setter String Comment;



    @ManyToOne
    @JoinColumn(name = "poolId", referencedColumnName = "poolId")
    private @Getter @Setter Pooling pooling;

    //relationships
    @OneToOne
    private @Getter @Setter User user;

    public UserRequest() {
    }

    public UserRequest(Long userRequestId, String reservationStatus, String comment) {
        this.userRequestId = userRequestId;
        this.reservationStatus = reservationStatus;
        Comment = comment;
    }


    @Override
    public String toString() {
        return "userRequest{" +
                "userRequestId=" + userRequestId +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", Comment='" + Comment + '\'' +
                '}';
    }
}
