package com.advanced.advanced.exceptions;

import com.advanced.advanced.exceptions.models.BussinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BussinessException.class)
    public ResponseEntity<String> handleBussinesException(BussinessException be) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(be.getMessage());
    }

}
