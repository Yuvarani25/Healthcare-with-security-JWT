package com.wipro.healthcare.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.healthcare.entity.Prescription;
 
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}

