package com.example.carpool.parking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class freeParking {

    @Id
    @GeneratedValue
    private Long leaveId;
    private String visa;
    private Date date;

    public freeParking(Long leaveId, String visa, Date date) {
        this.leaveId = leaveId;
        this.visa = visa;
        this.date = date;
    }

    public freeParking() {
    }

    public Long getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Long leaveId) {
        this.leaveId = leaveId;
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

    @Override
    public String toString() {
        return "leave{" +
                "leaveId=" + leaveId +
                ", visa='" + visa + '\'' +
                ", date=" + date +
                '}';
    }
}
