package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.NurseSpeciality;

import java.util.ArrayList;

public class NurseDto extends UserDto{
    private String nurse_code;
    private NurseSpeciality nurse_speciality;
    private ArrayList<HealthTeamDto> healthTeams;
}
