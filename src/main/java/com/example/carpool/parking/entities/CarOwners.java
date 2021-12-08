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


    @OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)


    private @Getter @Setter User user;
}
