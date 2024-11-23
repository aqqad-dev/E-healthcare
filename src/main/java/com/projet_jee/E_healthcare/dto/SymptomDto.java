package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.SymptomSeverity;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class SymptomDto {
    private Integer id;
    private String name;
    private String description;
    private SymptomSeverity severity;
    private Integer duration;
    private LocalDate onset;
}
