package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.NurseSpeciality;
import lombok.Data;

import java.util.ArrayList;

@Data
public class NurseDto extends UserDto{
    private String nurse_code;
    private NurseSpeciality nurse_speciality;
}