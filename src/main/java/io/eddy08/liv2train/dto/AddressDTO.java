package io.eddy08.liv2train.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String details;
    private String city;
    private String state;
    private int pincode;
}
