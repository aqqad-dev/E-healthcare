package com.projet_jee.E_healthcare.validator;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.projet_jee.E_healthcare.dto.SymptomDto;
import com.projet_jee.E_healthcare.model.Symptom;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class SymptomValidator {
    public static List<String> validate(SymptomDto symptomDto) {
        List<String> errors = new ArrayList<>();
        if (symptomDto == null) {
            errors.add("Symptom name is required");
            errors.add("Symptom description is required");
            errors.add("Symptom severity is required");
            errors.add("Symptom duration is required");
            errors.add("Symptom onset is required");
            return errors;
        }
        if (!StringUtils.hasLength(symptomDto.getName())) {
            errors.add("Symptom name is required");
        }
        if (!StringUtils.hasLength(symptomDto.getDescription())) {
            errors.add("Symptom description is required");
        }
        if (symptomDto.getSeverity() == null) {
            errors.add("Symptom severity is required");
        }
        if (symptomDto.getDuration() == null) {
            errors.add("Symptom duration is required");
        }
        if (symptomDto.getOnset() == null) {
            errors.add("Symptom onset is required");
        }
        return errors;
    }
}
