package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.PatientDto;
import com.projet_jee.E_healthcare.model.Patient;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface PatientMapper {
    PatientDto toDto(Patient patient);
    Patient toEntity(PatientDto patientDto);
    List<PatientDto> toDtos(List<Patient> patients);
}
