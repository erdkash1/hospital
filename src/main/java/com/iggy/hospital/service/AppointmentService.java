package com.iggy.hospital.service;

import com.iggy.hospital.entity.Appointment;
import com.iggy.hospital.entity.Patient;
import com.iggy.hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments(){ return appointmentRepository.findAll();}
    public Optional<Appointment> getAppointmentById(Long id){ return appointmentRepository.findById(id);}
    public List<Appointment> getAppointmentsByPatient(Patient patient){ return appointmentRepository.findByPatient(patient);}
    public Appointment saveAppointment(Appointment appointment){ return appointmentRepository.save(appointment);}
    public void deleteAppointment(Long id){ appointmentRepository.deleteById(id);}
}
