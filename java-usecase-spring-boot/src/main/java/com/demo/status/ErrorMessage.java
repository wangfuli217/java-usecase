package com.demo.status;

public class ErrorMessage {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage(){

    }

    public ErrorMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
