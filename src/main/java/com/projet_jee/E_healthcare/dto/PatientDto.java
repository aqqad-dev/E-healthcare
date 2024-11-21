package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.PatientStatus;

import java.util.ArrayList;

public class PatientDto extends UserDto{
    private String code_patient;
    private PatientStatus patient_status;
    private MedicalHistoryDto medical_history;
    private ArrayList<AppointmentDto> appointments;
    private ArrayList<SymptomDto> symptoms;
}
