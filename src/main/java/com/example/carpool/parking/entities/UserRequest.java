package com.example.carpool.parking.entities;

import javax.persistence.*;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserRequest {

    @Id
    @GeneratedValue
    private Long userRequestId;
    private String reservationStatus;
    private String Comment;



    @ManyToOne
    @JoinColumn(name = "poolId", referencedColumnName = "poolId")
    private Pooling pooling;

    //relationships
    @OneToOne
    private User user;

    public UserRequest() {
    }

    public UserRequest(Long userRequestId, String reservationStatus, String comment) {
        this.userRequestId = userRequestId;
        this.reservationStatus = reservationStatus;
        Comment = comment;
    }

    public Long getUserRequestId() {
        return userRequestId;
    }

    public void setUserRequestId(Long userRequestId) {
        this.userRequestId = userRequestId;
    }


    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public Pooling getPooling() {
        return pooling;
    }

    public void setPooling(Pooling pooling) {
        this.pooling = pooling;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
