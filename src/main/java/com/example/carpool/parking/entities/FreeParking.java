package com.example.carpool.parking.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FreeParking {

    @Id
    @GeneratedValue
    private Long leaveId;
//    private String visa;
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="visa", referencedColumnName ="visa")
    private User user;

    public FreeParking(Long leaveId, String visa, Date date) {
        this.leaveId = leaveId;
        this.date = date;
    }

    public FreeParking() {
    }

    public Long getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Long leaveId) {
        this.leaveId = leaveId;
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

                ", date=" + date +
                '}';
    }
}
