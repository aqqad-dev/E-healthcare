package com.projet_jee.E_healthcare.repository;

import com.projet_jee.E_healthcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
