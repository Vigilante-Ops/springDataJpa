package com.springdatajpa.springboot.Exceptions;

public class ValidIP extends RuntimeException{
    public ValidIP(String message) {
        super(message);
    }
}
