package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.DoctorDto;
import com.projet_jee.E_healthcare.model.Doctor;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface DoctorMapper {
    DoctorDto toDto(Doctor doctor);
    Doctor toEntity(DoctorDto doctorDto);
    List<DoctorDto> toDtos(List<Doctor> doctors);
}
