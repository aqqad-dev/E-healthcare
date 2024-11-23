package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.BillDto;
import com.projet_jee.E_healthcare.model.Bill;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface BillMapper {
    BillDto toDto(Bill bill);
    Bill toEntity(BillDto billDto);
    List<BillDto> toDtos(List<Bill> billList);
}
