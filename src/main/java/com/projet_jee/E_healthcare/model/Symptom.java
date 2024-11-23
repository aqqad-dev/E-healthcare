package com.projet_jee.E_healthcare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "symptom")
public class Symptom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "severity")
    @Enumerated(EnumType.STRING)
    private SymptomSeverity severity;
    @Column(name = "duration")
    private Integer duration;
    @Column(name = "onset")
    private LocalDate onset;
    @CreatedDate
    @Column(name = "creationdate", nullable = false)
    @JsonIgnore
    private Instant creation_date;
    @LastModifiedDate
    @Column(name = "modificationdate")
    @JsonIgnore
    private Instant modification_date;
    @ManyToMany(mappedBy = "symptoms")
    private ArrayList<Patient> patients;
    @ManyToMany
    @JoinTable(
            name = "symptoms_diseases",
            joinColumns = @JoinColumn(name = "symptom_Id"),
            inverseJoinColumns = @JoinColumn(name = "disease_id")
    )
    private ArrayList<Disease> diseases;
}
