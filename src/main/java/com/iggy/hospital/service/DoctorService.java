package com.iggy.hospital.service;

import com.iggy.hospital.entity.Department;
import com.iggy.hospital.entity.Doctor;
import com.iggy.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors(){ return doctorRepository.findAll();}
    public Optional<Doctor> getDoctorById(Long id){ return doctorRepository.findById(id);}
    public List<Doctor> getDoctorsByDepartment(Department department){ return doctorRepository.findByDepartment(department);}
    public Doctor saveDoctor(Doctor doctor){ return doctorRepository.save(doctor);}
    public void deleteDoctor(Long id){ doctorRepository.deleteById(id);}
}
