package com.example.carpool.parking.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FreeParking {

    @Id
    @GeneratedValue
    private @Getter @Setter Long  freeParkingID;
//    private String visa;
    private @Getter @Setter Date date;

    @ManyToOne
    @JoinColumn(name="visa", referencedColumnName ="visa")
    private @Getter @Setter User user;

}
