package com.example.carpool.parking.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserRequest {

    @Id
    @GeneratedValue
    private Long userRequestId;
    private String reservationStatus;
    private String Comment;

    /*//relationship many to many between UserRequest and Pooling
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "userrequest_pooling",
            joinColumns = {@JoinColumn(name = "userRequest_Id")},
            inverseJoinColumns = {@JoinColumn (name = "pool_Id")})
    private Set<Pooling> poolingss = new HashSet<>();*/

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "poolId", referencedColumnName = "poolId")
    private Pooling pooling;

    //relationships
    @OneToOne(cascade = CascadeType.ALL)
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


    @Override
    public String toString() {
        return "userRequest{" +
                "userRequestId=" + userRequestId +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", Comment='" + Comment + '\'' +
                '}';
    }
}
