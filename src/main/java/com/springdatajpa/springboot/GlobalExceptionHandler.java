package com.springdatajpa.springboot;

import com.springdatajpa.springboot.Exceptions.ValidIP;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler
{
    @ExceptionHandler(value = ValidIP.class)
    public ErrorResponse errorResponse(ValidIP exception)
    {
        ErrorResponse er=new ErrorResponse();
        er.setCustomcode(1001);
        er.setMessage(exception.getMessage());
        return er;

    }
}
