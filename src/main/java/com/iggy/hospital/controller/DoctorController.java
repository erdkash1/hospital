package com.iggy.hospital.controller;

import com.iggy.hospital.entity.Doctor;
import com.iggy.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAll(){ return doctorService.getAllDoctors();}

    @GetMapping("/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable Long id){ return doctorService.getDoctorById(id);}

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){ return doctorService.saveDoctor(doctor);}

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ doctorService.deleteDoctor(id);}


}
