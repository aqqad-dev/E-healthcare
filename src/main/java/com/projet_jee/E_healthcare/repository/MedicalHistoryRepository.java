package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Integer> {
}
