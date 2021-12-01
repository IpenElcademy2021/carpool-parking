package com.example.carpool.parking.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request {

    @Id
    @GeneratedValue
    private Long requestId;
    private Date date;
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="visa", referencedColumnName ="visa")
    private User user;

    @ManyToOne
    @JoinColumn(name = "carowners_car_plate")
    private CarOwners carowners;

    @ManyToOne
    @JoinColumn(name = "car_car_plate")
    private CarOwners car;

    public CarOwners getCar() {
        return car;
    }

    public void setCar(CarOwners car) {
        this.car = car;
    }

    public CarOwners getCarowners() {
        return carowners;
    }

    public void setCarowners(CarOwners carowners) {
        this.carowners = carowners;
    }

    public Request() {
    }

    public Request(Long requestId, String visa, Date date, String status) {
        this.requestId = requestId;
        this.date = date;
        this.status = status;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "request{" +
                "requestId=" + requestId +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
