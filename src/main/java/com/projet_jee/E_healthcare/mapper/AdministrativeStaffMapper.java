package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.AdministrativeStaffDto;
import com.projet_jee.E_healthcare.model.AdministrativeStaff;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface AdministrativeStaffMapper {
    AdministrativeStaffDto toDto(AdministrativeStaff administrativeStaff);
    AdministrativeStaff toEntity(AdministrativeStaffDto administrativeStaffDto);
    List<AdministrativeStaffDto> toDtos(List<AdministrativeStaff> administrativeStaffList);
}
