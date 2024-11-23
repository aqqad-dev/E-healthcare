package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<Disease, Integer> {
}
