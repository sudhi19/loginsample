package com.mh.loginsample.response;

public class ApiResponse {

    private int status;
    private String message;
    private Object result;

    public String getMessage() {
        return message;
    }

    public ApiResponse(int status, String message, Object result){
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

}