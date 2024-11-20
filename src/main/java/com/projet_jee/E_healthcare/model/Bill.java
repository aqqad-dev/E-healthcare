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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bill")
public class Bill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "amount")
    private double amount;
    @Column(name = "paymentstatus")
    @Enumerated(EnumType.STRING)
    private PaymentStatus payment_status;
    @Column(name = "dateissued")
    public LocalDate date_issued;
    @Column(name = "duedate")
    public LocalDate due_date;
    @CreatedDate
    @Column(name = "creationdate", nullable = false)
    @JsonIgnore
    private Instant creation_date;
    @LastModifiedDate
    @Column(name = "modificationdate")
    @JsonIgnore
    private Instant modification_date;
    @ManyToOne
    @JoinColumn(name = "appointmentid")
    private Appointment appointment;
}
