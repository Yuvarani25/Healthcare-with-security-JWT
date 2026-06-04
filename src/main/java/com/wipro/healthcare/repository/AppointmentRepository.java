package com.wipro.healthcare.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.healthcare.entity.Appointment;
 
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}