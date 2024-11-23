package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.AdminRole;
import lombok.Data;

import java.time.Instant;

@Data
public class AdministrativeStaffDto extends UserDto {
    private String admin_code;
    private AdminRole admin_role;
    private Instant creation_date;
    private Instant modification_date;
}
