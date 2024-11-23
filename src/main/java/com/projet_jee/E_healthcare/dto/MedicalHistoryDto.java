package com.projet_jee.E_healthcare.dto;

import lombok.Data;

@Data
public class MedicalHistoryDto {
    private Integer id;
    private boolean heart_disease;
    private boolean high_blood_pressure;
    private boolean diabetes;
    private String allergies;
}
