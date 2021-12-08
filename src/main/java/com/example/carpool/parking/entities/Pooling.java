package com.example.carpool.parking.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pooling {

    @Id
    @GeneratedValue
    private @Getter @Setter Long poolId;
    private @Getter @Setter Date date;
    private @Getter @Setter String region;
    private @Getter @Setter String pickUpPoint;
    private @Getter @Setter String pickUpTime;
    private @Getter @Setter String departureTime;
    private @Getter @Setter int seat;


    @ManyToOne
    @JoinColumn(name = "visa", referencedColumnName = "visa")
    private @Getter @Setter User user;

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
