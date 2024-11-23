package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
