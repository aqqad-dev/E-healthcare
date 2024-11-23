package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
