package com.wipro.healthcare.controller;
 
import com.wipro.healthcare.entity.Patient;
import com.wipro.healthcare.service.Patientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/patients")
public class PatientController {
 
    @Autowired
    private Patientservice service;
 
    // CREATE
    @PostMapping
    public Patient savePatient(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }
 
    // READ ALL
    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }
 
    // READ BY ID
    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        return service.getPatientById(id);
    }
 
    // UPDATE
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id,
                                 @RequestBody Patient patient) {
        return service.updatePatient(id, patient);
    }
 
    // DELETE
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        service.deletePatient(id);
        return "Patient deleted successfully";
    }
}
