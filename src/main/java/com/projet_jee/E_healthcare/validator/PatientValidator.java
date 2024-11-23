package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.PatientDto;
import com.projet_jee.E_healthcare.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientValidator {
    public static List<String> validate(PatientDto patientDto) {
        List<String> errors = new ArrayList<String>();
        if (patientDto.getPatient_status() == null) {
            errors.add("Patient Status is required");
        }
        return errors;
    }
}
