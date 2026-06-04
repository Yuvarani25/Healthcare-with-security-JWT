package com.wipro.healthcare.controller;

import com.wipro.healthcare.entity.Appointment;
import com.wipro.healthcare.repository.AppointmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository repository;

    //  GET all appointments
    @GetMapping
    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }

    @PostMapping
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        return repository.save(appointment);
    }
    
}