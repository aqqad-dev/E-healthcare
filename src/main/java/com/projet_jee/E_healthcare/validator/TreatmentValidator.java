package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.TreatmentDto;
import com.projet_jee.E_healthcare.model.Treatment;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TreatmentValidator {
    public static List<String> validate(TreatmentDto treatment) {
        List<String> errors = new ArrayList<>();
        if (treatment == null) {
            errors.add("Treatment name is required");
            errors.add("Treatment description is required");
            errors.add("Treatment type is required");
            errors.add("Treatment procedure is required");
            errors.add("Treatment duration is required");
            errors.add("Treatment frequency is required");
            return errors;
        }
        if (!StringUtils.hasLength(treatment.getName())) {
            errors.add("Treatment name is required");
        }
        if (!StringUtils.hasLength(treatment.getDescription())) {
            errors.add("Treatment description is required");
        }
        if (treatment.getType() == null) {
            errors.add("Treatment type is required");
        }
        if (!StringUtils.hasLength(treatment.getProcedure())){
            errors.add("Treatment procedure is required");
        }
        if (treatment.getDuration() == null) {
            errors.add("Treatment duration is required");
        }
        if (treatment.getFrequency() == null) {
            errors.add("Treatment frequency is required");
        }
        return errors;
    }
}
