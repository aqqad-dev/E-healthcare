package com.projet_jee.E_healthcare.dto;

import java.util.ArrayList;

public class DiseaseDto {
    private Integer id;
    private String name;
    private String description;
    private ArrayList<SymptomDto> symptoms;
    private ArrayList<TreatmentDto> treatments;
}
