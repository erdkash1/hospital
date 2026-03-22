package com.iggy.hospital.controller;

import com.iggy.hospital.entity.Appointment;
import com.iggy.hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAll(){ return appointmentService.getAllAppointments();}

    @GetMapping("/{id}")
    public Optional<Appointment> getAppointmentById(@PathVariable Long id){ return appointmentService.getAppointmentById(id);}

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){ return appointmentService.saveAppointment(appointment);}

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment){ return appointmentService.saveAppointment(appointment);}

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){ appointmentService.deleteAppointment(id);}
}
