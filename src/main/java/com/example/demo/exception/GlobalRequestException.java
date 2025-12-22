package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalRequestException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ApiResponse handleNotFound(ResourceNotFoundException ex) {
        return new ApiResponse(false, ex.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    public ApiResponse handleBadRequest(BadRequestException ex) {
        return new ApiResponse(false, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ApiResponse handleException(Exception ex) {
        return new ApiResponse(false, "Internal Server Error");
    }
}
