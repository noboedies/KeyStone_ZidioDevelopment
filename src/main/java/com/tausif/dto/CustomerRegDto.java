package com.tausif.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerRegDto {

    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Size(min=6, max = 10)
    private String username;
    @NotBlank
    @Size(min = 2, max = 30)
    private String name;
    @NotBlank
    @Pattern(regexp = "\\d{10}", message = "Phone number must contain exactly 10 digits")
    private String phone;
    @NotBlank
    @Size(min = 8, max = 12)
    private String password;
}
