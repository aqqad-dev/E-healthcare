package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.HealthTeamDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class HealthTeamValidator {
    public static List<String> validate(HealthTeamDto healthTeamDto) {
        List<String> errors = new ArrayList<String>();
        if (!StringUtils.hasLength(healthTeamDto.getTeamName())){
            errors.add("Team name is required");
        }
        return errors;
    }
}
