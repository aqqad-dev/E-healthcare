package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Integer> {
}
