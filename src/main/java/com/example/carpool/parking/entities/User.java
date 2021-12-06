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

public class User {

    @Id
    private @Getter @Setter String visa;
    private @Getter @Setter String password;
    private @Getter @Setter String name;
    private @Getter @Setter String address;
    private  @Getter @Setter String phoneNumber;

    /*//relationship many to many between User and Pooling
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "users")
    private Set<Pooling> poolings = new HashSet<>();*/
    @OneToMany(mappedBy = "user")
//    private @Getter @Setter Set<Request> request = new HashSet<>();

    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private  @Getter @Setter CarOwners carOwners;

//v1
//    @OneToOne (fetch = FetchType.LAZY)
//    @JoinColumn(name = "carPlate")
//    private @Getter @Setter CarOwners carOwners;

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private @Getter @Setter CarOwners carOwners;


}
