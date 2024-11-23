package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.PatientStatus;
import lombok.Data;

import java.util.ArrayList;

@Data
public class PatientDto extends UserDto{
    private String code_patient;
    private PatientStatus patient_status;
}
