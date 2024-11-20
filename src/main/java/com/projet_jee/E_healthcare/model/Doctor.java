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
@Table(name = "doctor")
public class Doctor extends User{
    @Column(name = "doctorcode", unique = true, nullable = false)
    private String doctor_code;
    @Column(name = "doctorspeciality")
    @Enumerated(EnumType.STRING)
    private DoctorSpeciality doctor_speciality;
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
        if (doctor_code == null){
            doctor_code = "D" + System.currentTimeMillis();
        }
    }

    @OneToMany(mappedBy = "doctor")
    private ArrayList<HealthTeam> healthTeams;

    @OneToMany(mappedBy = "doctor")
    private ArrayList<Appointment> appointments;
}
