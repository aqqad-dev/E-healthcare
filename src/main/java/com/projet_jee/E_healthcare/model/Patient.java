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
@Table(name = "patient")
public class Patient extends User{
    @Column(name = "codepatient", unique = true, nullable = false)
    private String code_patient;
    @Column(name = "patientstatus")
    @Enumerated(EnumType.STRING)
    private PatientStatus patient_status;
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
        if (code_patient == null){
            code_patient = "P" + System.currentTimeMillis();
        }
    }

    @OneToOne
    @JoinColumn(name = "medical_history_id")
    private MedicalHistory medical_history;

    @OneToMany(mappedBy = "patient")
    private ArrayList<Appointment> appointments;

    @ManyToMany
    @JoinTable(
            name = "patients_symptoms",
            joinColumns = @JoinColumn(name = "patient_Id"),
            inverseJoinColumns = @JoinColumn(name = "symptom_id")
    )
    private ArrayList<Symptom> symptoms;
}
