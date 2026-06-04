package com.wipro.healthcare.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.healthcare.entity.Patient;
 
public interface PatientRepository extends JpaRepository<Patient, Long> {
}

