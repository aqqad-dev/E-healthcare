package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.SymptomSeverity;

import java.time.LocalDate;
import java.util.ArrayList;

public class SymptomDto {
    private Integer id;
    private String name;
    private String description;
    private SymptomSeverity severity;
    private int duration;
    private LocalDate onset;
    private ArrayList<PatientDto> patients;
    private ArrayList<DiseaseDto> diseases;
}
