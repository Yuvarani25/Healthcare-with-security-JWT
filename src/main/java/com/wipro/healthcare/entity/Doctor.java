package com.wipro.healthcare.entity;
 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
public class Doctor {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;
 
    private String name;
    private String specialization;
    private String phone;
    
//    @JsonManagedReference
//@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
//    private List<Appointment> appointments;
    @JsonIgnore
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}
    
