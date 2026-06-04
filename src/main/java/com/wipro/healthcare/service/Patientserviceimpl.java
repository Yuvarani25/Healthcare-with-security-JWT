package com.wipro.healthcare.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.healthcare.entity.Patient;
import com.wipro.healthcare.repository.PatientRepository;
 
@Service
public class Patientserviceimpl implements Patientservice {
 
    @Autowired
    private PatientRepository repository;
 
    @Override
    public Patient savePatient(Patient patient) {
        return repository.save(patient);
    }
 
    @Override
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }
 
    @Override
    public Patient getPatientById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Patient not found with id " + id));
    }
 
    @Override
    public Patient updatePatient(Long id, Patient patient) {

        Patient existing = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Patient not found with id " + id));

        existing.setName(patient.getName());
        existing.setAge(patient.getAge());
        existing.setDisease(patient.getDisease());

        return repository.save(existing);
    }
    @Override
    public void deletePatient(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Patient not found");
        }
        repository.deleteById(id);
    }
}
 