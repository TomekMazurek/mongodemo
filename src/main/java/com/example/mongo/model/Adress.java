package com.example.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Adress {

    private String street;
    private String city;
    private String postalCode;

    @Override
    public String toString() {
        return street +", " + postalCode + " " + city;
    }
}
