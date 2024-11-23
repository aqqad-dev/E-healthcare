package com.projet_jee.E_healthcare.mapper;

import com.projet_jee.E_healthcare.dto.UserDto;
import com.projet_jee.E_healthcare.model.User;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
    List<UserDto> toDtos(List<User> users);
}
