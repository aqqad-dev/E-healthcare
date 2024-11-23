package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.UserDto;
import com.projet_jee.E_healthcare.model.User;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {
    public static List<String> validate(UserDto userDto) {
        List<String> errors = new ArrayList<String>();
        if (userDto == null) {
            errors.add("Name is required");
            errors.add("Gender is required");
            errors.add("Date of Birth is required");
            errors.add("Please provide Address Line 1");
            errors.add("Please provide the city");
            errors.add("Please provide the country");
            errors.add("Please provide the postal code");
            errors.add("Phone is required");
            errors.add("Email is required");
            return errors;
        }
        if (!StringUtils.hasLength(userDto.getName())){
            errors.add("Name is required");
        }
        if (!StringUtils.hasLength(userDto.getSex())){
            errors.add("Gender is required");
        }
        if (userDto.getDateOfBirth() == null){
            errors.add("Date of Birth is required");
        }
        errors = AddressValidator.validate(userDto.getAddress());
        if (!StringUtils.hasLength(userDto.getPhone())){
            errors.add("Phone is required");
        }
        if (!StringUtils.hasLength(userDto.getEmail())){
            errors.add("Email is required");
        }
        return errors;
    }
}
