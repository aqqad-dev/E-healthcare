package com.projet_jee.E_healthcare.dto;

import java.util.ArrayList;

public class HealthTeamDto {
    private Integer id;
    private String teamName;
    private ArrayList<NurseDto> nurses;
    private AdministrativeStaffDto admin;
    private DoctorDto doctor;
}