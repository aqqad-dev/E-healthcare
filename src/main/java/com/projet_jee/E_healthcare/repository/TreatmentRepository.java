package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Integer> {
}
