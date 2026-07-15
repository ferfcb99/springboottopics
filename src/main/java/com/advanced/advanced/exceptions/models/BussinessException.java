package com.advanced.advanced.exceptions.models;

public class BussinessException extends RuntimeException {

    private String errorPersonalizedMessage;

    public BussinessException(String message) {
        super(message);
    }

    public BussinessException(String message, String cause) {
      super(message);
      this.errorPersonalizedMessage = cause;
    }


}
