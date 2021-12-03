package com.example.carpool.parking.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request {

    @Id
    @GeneratedValue
    private @Getter @Setter Integer requestId;
    private @Getter @Setter Date date;
    private @Getter @Setter String driverVisa;
    private @Getter @Setter String status;

    @ManyToOne
    @JoinColumn(name="visa", referencedColumnName ="visa")
    private @Getter @Setter User user;

}
