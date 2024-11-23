package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse, Integer> {
}
