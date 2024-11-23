package com.projet_jee.E_healthcare.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Data
public class AppointmentDto {
    private Integer id;
    private LocalDate date;
    private LocalTime time;
}
