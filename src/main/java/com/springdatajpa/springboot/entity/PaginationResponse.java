package com.springdatajpa.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class PaginationResponse
{
    private int totalPageSize;
    private List<Product> products;
}
