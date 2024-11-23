package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.DoctorSpeciality;
import lombok.Data;

import java.util.ArrayList;

@Data
public class DoctorDto extends UserDto{
    private String doctor_code;
    private DoctorSpeciality doctor_speciality;
}
