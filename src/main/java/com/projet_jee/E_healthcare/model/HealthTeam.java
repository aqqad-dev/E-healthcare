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
@Table(name = "healthteam")
public class HealthTeam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "teamname")
    private String teamName;
    @CreatedDate
    @Column(name = "creationdate", nullable = false)
    @JsonIgnore
    private Instant creation_date;
    @LastModifiedDate
    @Column(name = "modificationdate")
    @JsonIgnore
    private Instant modification_date;


    @ManyToMany
    @JoinTable(
            name = "nurses_healthteams",
            joinColumns = @JoinColumn(name = "healthTeams_Id"),
            inverseJoinColumns = @JoinColumn(name = "nurse_id")
    )
    private ArrayList<Nurse> nurses;

    @ManyToOne
    @JoinColumn(name = "idadmin")
    private AdministrativeStaff admin;

    @ManyToOne
    @JoinColumn(name = "iddoctor")
    private Doctor doctor;
}
