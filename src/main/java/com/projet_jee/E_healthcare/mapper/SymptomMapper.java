package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.SymptomDto;
import com.projet_jee.E_healthcare.model.Symptom;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface SymptomMapper {
    SymptomDto toDto(Symptom symptom);
    Symptom toEntity(SymptomDto symptomDto);
    List<SymptomDto> toDtos(List<Symptom> symptoms);
}
