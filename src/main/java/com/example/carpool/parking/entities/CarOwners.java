package com.example.carpool.parking.entities;

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





    @OneToMany(mappedBy = "carowners")
    private Set<Request> request = new HashSet<>();

}
