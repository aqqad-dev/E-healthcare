package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.DiseaseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DiseaseValidator {
    public static List<String> validate(DiseaseDto diseaseDto){
        List<String> errors = new ArrayList<>();
        if (diseaseDto == null){
            errors.add("Please enter a name!");
            errors.add("Please enter a description!");
            return errors;
        }
        if (!StringUtils.hasLength(diseaseDto.getName())){
            errors.add("Please enter a name!");
        }
        if (!StringUtils.hasLength(diseaseDto.getDescription())){
            errors.add("Please enter a description!");
        }
        return errors;
    }
}
