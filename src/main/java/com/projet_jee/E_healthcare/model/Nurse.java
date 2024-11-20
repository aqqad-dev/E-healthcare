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
@Table(name = "nurse")
public class Nurse extends User{
    @Column(name = "nursecode", unique = true, nullable = false)
    private String nurse_code;
    @Column(name = "nursespeciality")
    @Enumerated(EnumType.STRING)
    private NurseSpeciality nurse_speciality;
    @CreatedDate
    @Column(name = "creationdate", nullable = false)
    @JsonIgnore
    private Instant creation_date;
    @LastModifiedDate
    @Column(name = "modificationdate")
    @JsonIgnore
    private Instant modification_date;


    @ManyToMany(mappedBy = "nurses")
    private ArrayList<HealthTeam> healthTeams;

    @PrePersist
    private void generateCode(){
        if (nurse_code == null) {
            nurse_code = "N" + System.currentTimeMillis();
        }
    }
}
