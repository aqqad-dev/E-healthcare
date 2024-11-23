package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.MedicalHistoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MedicalHistoryValidator {
    public static List<String> validate(MedicalHistoryDto medicalHistoryDto) {
        List<String> errors = new ArrayList<String>();
        if (medicalHistoryDto == null) {
            errors.add("Diabetes?");
            errors.add("Heart disease?");
            errors.add("High blood pressure?");
            return errors;
        }
        if (!StringUtils.hasLength(String.valueOf(medicalHistoryDto.isDiabetes()))){
            errors.add("Diabetes?");
        }
        if (!StringUtils.hasLength(String.valueOf(medicalHistoryDto.isHeart_disease()))){
            errors.add("Heart disease?");
        }
        if (!StringUtils.hasLength(String.valueOf(medicalHistoryDto.isHigh_blood_pressure()))){
            errors.add("High blood pressure?");
        }
        return errors;
    }
}
