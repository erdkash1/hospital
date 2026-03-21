package com.iggy.hospital.repository;

import com.iggy.hospital.entity.Appointment;
import com.iggy.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    public List<Appointment> findByPatient(Patient patient);
}
