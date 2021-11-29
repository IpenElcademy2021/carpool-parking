package com.example.carpool.parking.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pooling {

    @Id
    @GeneratedValue
    private Long poolId;
    private Date date;
    private String region;
    private String pickUpPoint;
    private String pickUpTime;
    private String departureTime;
    private int seat;

    /*//relationship many to many between User and Pooling
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "user_pooling",
            joinColumns = {@JoinColumn(name = "pool_ID")},
            inverseJoinColumns = {@JoinColumn (name = "visa")})
    private Set<User> users = new HashSet<>();*/

    /*//relationship many to many between UserRequest and Pooling
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "poolingss")
    private Set<UserRequest> userRequests = new HashSet<>();*/

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visa", referencedColumnName = "visa")
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "pooling")
    private Set<UserRequest> userRequest = new HashSet<>();


    public Pooling() {
    }

    public Pooling(Long poolId, Date date, String region, String pickUpPoint, String pickUpTime, String departureTime, int seat) {
        this.poolId = poolId;
        this.date = date;
        this.region = region;
        this.pickUpPoint = pickUpPoint;
        this.pickUpTime = pickUpTime;
        this.departureTime = departureTime;
        this.seat = seat;
    }

    public Long getPoolId() {
        return poolId;
    }

    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(String pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }


    @Override
    public String toString() {
        return "pooling{" +
                "poolId=" + poolId +
                ", date=" + date +
                ", region='" + region + '\'' +
                ", pickUpPoint='" + pickUpPoint + '\'' +
                ", pickUpTime='" + pickUpTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", seat=" + seat +
                '}';
    }
}
