package io.eddy08.liv2train.domain;

import lombok.Data;

@Data
public class Address {
    private String details;
    private String city;
    private String state;
    private int pincode;
}
