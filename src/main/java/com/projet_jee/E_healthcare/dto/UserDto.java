package com.projet_jee.E_healthcare.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Integer id;
    private String name;
    private String sex;
    private LocalDate dateOfBirth;
    private AddressDto address;
    private String phone;
    private String email;
    private String photo;
    private String username;
    private String password;
}
