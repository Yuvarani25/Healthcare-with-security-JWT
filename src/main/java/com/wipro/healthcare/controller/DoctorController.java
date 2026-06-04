package com.wipro.healthcare.controller;

import com.wipro.healthcare.entity.Doctor;
import com.wipro.healthcare.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    // ✅ CREATE doctor
    @PostMapping
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return repository.save(doctor);
    }

    // ✅ GET all doctors
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }
}