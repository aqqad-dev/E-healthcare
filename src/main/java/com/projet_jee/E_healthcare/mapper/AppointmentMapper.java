package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.AppointmentDto;
import com.projet_jee.E_healthcare.model.Appointment;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface AppointmentMapper {
    AppointmentDto toDto(Appointment Appointment);
    Appointment toEntity(AppointmentDto appointmentDto);
    List<AppointmentDto> toDtos(List<Appointment> appointmentList);
}
