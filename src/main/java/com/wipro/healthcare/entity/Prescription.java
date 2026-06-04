package com.wipro.healthcare.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Prescription {

	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long prescriptionId;
	 
	    private String medicineName;
	    private String dosage;
	    private int days;
	    
	    @JsonBackReference
	    @OneToOne
	    @JoinColumn(name = "appointment_id")
	    private Appointment appointment;
	
	
}
