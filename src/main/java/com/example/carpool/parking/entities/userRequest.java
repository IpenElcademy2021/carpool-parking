package com.example.carpool.parking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class userRequest {

    @Id
    @GeneratedValue
    private Long userRequestId;
    private Long poolId;
    private String reservationStatus;
    private String Comment;

    public userRequest() {
    }

    public userRequest(Long userRequestId, Long poolId, String reservationStatus, String comment) {
        this.userRequestId = userRequestId;
        this.poolId = poolId;
        this.reservationStatus = reservationStatus;
        Comment = comment;
    }

    public Long getUserRequestId() {
        return userRequestId;
    }

    public void setUserRequestId(Long userRequestId) {
        this.userRequestId = userRequestId;
    }

    public Long getPoolId() {
        return poolId;
    }

    public void setPoolId(Long poolId) {
        this.poolId = poolId;
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

    @Override
    public String toString() {
        return "userRequest{" +
                "userRequestId=" + userRequestId +
                ", poolId=" + poolId +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", Comment='" + Comment + '\'' +
                '}';
    }
}
