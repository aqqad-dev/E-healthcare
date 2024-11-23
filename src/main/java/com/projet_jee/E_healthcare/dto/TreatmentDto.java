package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.TreatmentType;
import lombok.Data;

import java.util.ArrayList;

@Data
public class TreatmentDto {
    private Integer id;
    private String name;
    private String description;
    private TreatmentType type;
    private String procedure;
    private Integer duration;
    private Integer frequency;
}
