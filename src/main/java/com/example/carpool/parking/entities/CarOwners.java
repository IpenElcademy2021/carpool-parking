package com.example.carpool.parking.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarOwners {
    @Id
    private @Getter @Setter String carPlate;
    private @Getter @Setter Integer parkingSlot;


    //relationships
//    @OneToOne(mappedBy = "carOwners", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private @Getter @Setter User user;

//    @OneToOne (fetch = FetchType.LAZY)
//    @JoinColumn(name = "uservisa")
//    private @Getter @Setter User user;

    @OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "visa")

    private @Getter @Setter User user;
}
