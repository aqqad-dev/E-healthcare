package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.AddressDto;
import com.projet_jee.E_healthcare.model.Address;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface AddressMapper {
    AddressDto toDto(Address address);
    Address toEntity(AddressDto addressDto);
    List<AddressDto> toDtos(List<Address> addressList);
}
