package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.AdministrativeStaffDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AdministrativeStaffValidator {
    public static List<String> validate(AdministrativeStaffDto administrativeStaffDto) {
        List<String> errors = new ArrayList<String>();
        if (!StringUtils.hasLength(administrativeStaffDto.getAdmin_code())){
            errors.add("Please enter administrative staff code");
        }
        return errors;
    }
}
