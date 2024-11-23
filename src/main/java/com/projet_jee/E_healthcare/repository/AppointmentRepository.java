package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
