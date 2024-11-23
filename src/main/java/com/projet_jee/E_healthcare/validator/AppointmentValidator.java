package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.AppointmentDto;
import com.projet_jee.E_healthcare.model.Appointment;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AppointmentValidator {
    public static List<String> validate(AppointmentDto appointmentDto) {
        List<String> errors = new ArrayList<>();
        if (appointmentDto.getDate() == null) {
            errors.add("Date is required");
        }
        if (appointmentDto.getTime() == null) {
            errors.add("Time is required");
        }
        return errors;
    }
}
