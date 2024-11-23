package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.MedicalHistoryDto;
import com.projet_jee.E_healthcare.model.MedicalHistory;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface MedicalHistoryMapper {
    MedicalHistoryDto toDto(MedicalHistory medicalHistory);
    MedicalHistory toEntity(MedicalHistoryDto medicalHistoryDto);
    List<MedicalHistoryDto> toDtos(List<MedicalHistory> medicalHistories);
}
