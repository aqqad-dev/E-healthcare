package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.DiseaseDto;
import com.projet_jee.E_healthcare.model.Disease;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface DiseaseMapper {
    DiseaseDto toDto(Disease disease);
    Disease toEntity(DiseaseDto diseaseDto);
    List<DiseaseDto> toDtos(List<Disease> diseases);
}
