package com.iggy.hospital.controller;

import com.iggy.hospital.entity.Patient;
import com.iggy.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAll(){ return patientService.getAllPatients();}

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id){ return patientService.getPatientById(id);}

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){ return patientService.savePatient(patient);}

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient){ return patientService.savePatient(patient);}

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){ patientService.deletePatient(id);}
}
