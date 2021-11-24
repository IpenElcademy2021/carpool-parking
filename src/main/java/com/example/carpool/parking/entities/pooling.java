package com.example.carpool.parking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class pooling {

    @Id
    @GeneratedValue
    private Long poolId;
    private String visa;
    private Date date;
    private String region;
    private String pickUpPoint;
    private String pickUpTime;
    private String departureTime;
    private int seat;

    public pooling() {
    }

    public pooling(Long poolId, String visa, Date date, String region, String pickUpPoint, String pickUpTime, String departureTime, int seat) {
        this.poolId = poolId;
        this.visa = visa;
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

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
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
                ", visa='" + visa + '\'' +
                ", date=" + date +
                ", region='" + region + '\'' +
                ", pickUpPoint='" + pickUpPoint + '\'' +
                ", pickUpTime='" + pickUpTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", seat=" + seat +
                '}';
    }
}
