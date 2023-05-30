package com.taskmanager.comman.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomerException extends RuntimeException{
    private final HttpStatus httpStatus;

    public CustomerException(final HttpStatus httpStatus, final String message){
        super(message);
        this.httpStatus = httpStatus;
    }
}
