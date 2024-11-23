package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.AddressDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AddressValidator {
    public static List<String> validate(AddressDto addressDto) {
        List<String> errors = new ArrayList<>();

        if (addressDto == null) {
            errors.add("Please provide Address Line 1");
            errors.add("Please provide the city");
            errors.add("Please provide the country");
            errors.add("Please provide the postal code");
            return errors;
        }
        if (!StringUtils.hasLength(addressDto.getAddress_line1())) {
            errors.add("Please provide Address Line 1");
        }
        if (!StringUtils.hasLength(addressDto.getCity())) {
            errors.add("Please provide the city");
        }
        if (!StringUtils.hasLength(addressDto.getCountry())) {
            errors.add("Please provide the country");
        }
        if (!StringUtils.hasLength(addressDto.getPostal_code())) {
            errors.add("Please provide the postal code");
        }
        return errors;
    }
}
