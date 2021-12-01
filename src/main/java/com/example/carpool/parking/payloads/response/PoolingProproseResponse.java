package com.example.carpool.parking.payloads.response;

public class PoolingProproseResponse {
    private String message;

    public PoolingProproseResponse(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
