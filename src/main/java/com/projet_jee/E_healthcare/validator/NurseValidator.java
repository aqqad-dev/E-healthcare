package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.NurseDto;
import com.projet_jee.E_healthcare.model.Nurse;

import java.util.ArrayList;
import java.util.List;

public class NurseValidator {
    public static List<String> validate(NurseDto nurseDto) {
        List<String> errors = new ArrayList<>();
        if (nurseDto.getNurse_speciality() == null) {
            errors.add("Nurse Speciality is required");
        }
        return errors;
    }
}
