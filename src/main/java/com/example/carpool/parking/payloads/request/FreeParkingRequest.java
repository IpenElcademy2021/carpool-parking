package com.example.carpool.parking.payloads.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class FreeParkingRequest {
    @NotBlank
    @NotNull
    private @Getter @Setter Long freeParkingID;
    private @Getter @Setter Date date;
    private @Getter @Setter String user;
}
