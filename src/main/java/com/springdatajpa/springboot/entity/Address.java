package com.springdatajpa.springboot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Long id;

    @Column(name="street")
    @JsonProperty("street")
    private String street;

    @JsonProperty("city")
    @Column(name = "city")
    private String city;

    @Column(name = "state")
    @JsonProperty("state")
    private String state;

    @Column(name = "country")
    @JsonProperty("country")
    private String country;

    @Column(name = "zip_code")
    @JsonProperty("zipCode")
    private String zipCode;
}
