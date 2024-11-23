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
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "treatment")
public class Treatment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "'type'")
    @Enumerated(EnumType.STRING)
    private TreatmentType type;
    @Column(name = "'procedure'")
    private String procedure;
    @Column(name = "duration")
    private Integer duration;
    @Column(name = "frequency")
    private Integer frequency;
    @CreatedDate
    @Column(name = "creationdate", nullable = false)
    @JsonIgnore
    private Instant creation_date;
    @LastModifiedDate
    @Column(name = "modificationdate")
    @JsonIgnore
    private Instant modification_date;
    @ManyToMany(mappedBy = "treatments")
    private ArrayList<Disease> diseases;
}
