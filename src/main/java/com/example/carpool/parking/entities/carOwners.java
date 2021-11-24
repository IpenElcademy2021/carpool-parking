package com.example.carpool.parking.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class carOwners {
    @Id
    private String carPlate;
    private int parkingSlot;

    public carOwners() {
    }

    public carOwners(String carPlate, int parkingSlot) {
        this.carPlate = carPlate;

        this.parkingSlot = parkingSlot;
    }

    //relationships
    @OneToOne(cascade = CascadeType.ALL)
    private user user;

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }


    public int getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(int parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    @Override
    public String toString() {
        return "carOwners{" +
                "carPlate='" + carPlate + '\'' +
                ", parkingSlot=" + parkingSlot +
                ", user=" + user +
                '}';
    }
}
