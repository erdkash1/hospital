package com.iggy.hospital.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctors")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    private String specialization;
    private String phoneNumber;
    private boolean available;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Department getDepartment() {return department;}
    public void setDepartment(Department department) {this.department = department;}

    public String getSpecialization() {return specialization;}
    public void setSpecialization(String specialization) {this.specialization = specialization;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public boolean isAvailable() {return available;}
    public void setAvailable(boolean available) {this.available = available;}

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
}
