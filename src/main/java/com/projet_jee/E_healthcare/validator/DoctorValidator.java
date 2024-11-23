package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.DoctorDto;

import java.util.ArrayList;
import java.util.List;

public class DoctorValidator {
    public static List<String> validate(DoctorDto doctorDto) {
        List<String> errors = new ArrayList<>();
        if (doctorDto.getDoctor_speciality() == null){
            errors.add("Please enter the doctor's speciality");
        }
        return errors;
    }
}
