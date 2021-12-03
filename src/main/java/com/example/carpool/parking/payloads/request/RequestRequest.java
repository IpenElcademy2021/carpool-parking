package com.example.carpool.parking.payloads.request;

import com.example.carpool.parking.entities.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class RequestRequest {

    @NotBlank
    @NotNull
    private @Getter @Setter Integer requestId;
    private @Getter @Setter Date date;
    private @Getter @Setter String status;
    private @Getter @Setter String DriverVisa;
    private @Getter @Setter User user;

}
