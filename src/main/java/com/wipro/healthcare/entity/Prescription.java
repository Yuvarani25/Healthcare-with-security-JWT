package com.wipro.healthcare.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

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
