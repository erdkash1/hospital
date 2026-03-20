package com.iggy.hospital.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private LocalDateTime appointmentDate;
    private String status;
    private String notes;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public String getNotes() {return notes;}
    public void setNotes(String notes) {this.notes = notes;}

    public LocalDateTime getAppointmentDate() {return appointmentDate;}
    public void setAppointmentDate(LocalDateTime appointmentDate) {this.appointmentDate = appointmentDate;}

    public Doctor getDoctor() {return doctor;}
    public void setDoctor(Doctor doctor) {this.doctor = doctor;}

    public Patient getPatient() {return patient;}
    public void setPatient(Patient patient) {this.patient = patient;}
}
