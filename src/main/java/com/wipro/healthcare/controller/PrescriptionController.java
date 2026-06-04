package com.wipro.healthcare.controller;


import com.wipro.healthcare.entity.Prescription;
import com.wipro.healthcare.repository.PrescriptionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository repository;

    // ✅ CREATE prescription
    @PostMapping
    public Prescription savePrescription(@RequestBody Prescription prescription) {
        return repository.save(prescription);
    }

    // ✅ GET all prescriptions
    @GetMapping
    public List<Prescription> getAll() {
        return repository.findAll();
    }
}
