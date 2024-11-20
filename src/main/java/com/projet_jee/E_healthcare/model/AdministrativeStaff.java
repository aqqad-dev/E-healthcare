package com.projet_jee.E_healthcare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "administrativestaff")
public class AdministrativeStaff extends User{
    @Column(name = "admincode", unique = true, nullable = false)
    private String admin_code;
    @Column(name = "adminrole")
    @Enumerated(EnumType.STRING)
    private AdminRole admin_role;
    @CreatedDate
    @Column(name = "creationdate", nullable = false)
    @JsonIgnore
    private Instant creation_date;
    @LastModifiedDate
    @Column(name = "modificationdate")
    @JsonIgnore
    private Instant modification_date;

    @PrePersist
    private void generateCode(){
        if (admin_code == null){
            admin_code = "A" + System.currentTimeMillis();
        }
    }

    @OneToMany(mappedBy = "admin")
    private ArrayList<HealthTeam> healthTeams;
}
