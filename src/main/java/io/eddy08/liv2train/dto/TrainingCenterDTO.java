package io.eddy08.liv2train.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
public class TrainingCenterDTO {
    @NotBlank(message = "Center Name value must be Present")
    @Size(max=40, min=1,message = "Center Name '${validatedValue}' must be less than 40 characters")
    private String centerName;
    @NotBlank(message = "Center Code value must be Present")
    @Pattern(regexp = "^[A-z]{12}$", message = "Center Code '${validatedValue}' must be alphanumeric and contains 12 characters ")
    private String centerCode;
    @NotNull(message = "Address value must be present")
    @Valid
    private AddressDTO address;
    private int studentCapacity;
    private List<String> courseOffered;
    
    @Email
    private String contactEmail;
    private String contactPhone;
}
