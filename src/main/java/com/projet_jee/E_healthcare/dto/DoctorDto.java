package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.DoctorSpeciality;

import java.util.ArrayList;

public class DoctorDto extends UserDto{
    private String doctor_code;
    private DoctorSpeciality doctor_speciality;
    private ArrayList<HealthTeamDto> healthTeams;
    private ArrayList<AppointmentDto> appointments;
}
