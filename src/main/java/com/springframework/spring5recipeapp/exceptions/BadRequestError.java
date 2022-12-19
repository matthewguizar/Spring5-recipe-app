package com.springframework.spring5recipeapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestError extends RuntimeException {

    public BadRequestError(){
        super();
    }
    public BadRequestError(String message){
        super(message);
    }
    public BadRequestError(String message, Throwable cause) {
        super(message,cause);
    }
}
