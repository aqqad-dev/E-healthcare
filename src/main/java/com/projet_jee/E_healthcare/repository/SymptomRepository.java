package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SymptomRepository extends JpaRepository<Symptom, Integer> {
}
