package com.projet_jee.E_healthcare.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class AddressDto {
    private String address_line1;
    private String address_line2;
    private String city;
    private String postal_code;
    private String country;
}
