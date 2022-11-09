package com.springdatajpa.springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse
{
    private int customcode;
    private String message;
}
