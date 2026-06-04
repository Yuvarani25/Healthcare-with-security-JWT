package com.wipro.healthcare.service;

import java.util.List;

import com.wipro.healthcare.entity.Patient;
 

public interface Patientservice {

    Patient savePatient(Patient patient);
 
    List<Patient> getAllPatients();
 
    Patient getPatientById(Long id);
 
    Patient updatePatient(Long id, Patient patient);
 
    void deletePatient(Long id);
}