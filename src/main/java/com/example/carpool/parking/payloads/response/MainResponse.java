package com.example.carpool.parking.payloads.response;

public class MainResponse {
    private String message;

    public MainResponse(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
