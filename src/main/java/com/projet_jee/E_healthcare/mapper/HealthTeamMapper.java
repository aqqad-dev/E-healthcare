package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.HealthTeamDto;
import com.projet_jee.E_healthcare.model.HealthTeam;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface HealthTeamMapper {
    HealthTeamDto toDto(HealthTeam healthTeam);
    HealthTeam toEntity(HealthTeamDto healthTeamDto);
    List<HealthTeamDto> toDtos(List<HealthTeam> healthTeams);
}
