package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.NurseDto;
import com.projet_jee.E_healthcare.model.Nurse;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface NurseMapper {
    NurseDto toDto(Nurse nurse);
    Nurse toEntity(NurseDto dto);
    List<NurseDto> toDtos(List<Nurse> nurseList);
}