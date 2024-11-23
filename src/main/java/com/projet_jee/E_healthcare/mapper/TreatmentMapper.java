package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.TreatmentDto;
import com.projet_jee.E_healthcare.model.Treatment;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface TreatmentMapper {
    TreatmentDto toDto(Treatment treatment);
    Treatment toEntity(TreatmentDto treatmentDto);
    List<TreatmentDto> toDtos(List<Treatment> treatments);
}
