package com.example.carpool.parking.payloads.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

public class UserRequestt {

    @NotBlank
    @NotNull
    private @Getter @Setter String visa;
    private @Getter @Setter String password;
    private @Getter @Setter String name;
    private @Getter @Setter String address;
    private @Getter @Setter String phoneNumber;


}
