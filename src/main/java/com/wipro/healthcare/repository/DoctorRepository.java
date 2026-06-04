package com.wipro.healthcare.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.healthcare.entity.Doctor;
 
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}

