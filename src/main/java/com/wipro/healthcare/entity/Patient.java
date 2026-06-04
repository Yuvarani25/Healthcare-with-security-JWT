
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
public class Patient {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
 
    private String name;
    private int age;
    private String disease;
    
//    @JsonIgnore
//    @JsonManagedReference
//    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
//      private List<Appointment> appointments;

    @JsonIgnore
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}