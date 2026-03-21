package com.iggy.hospital.repository;

import com.iggy.hospital.entity.Department;
import com.iggy.hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    public List<Doctor> findByDepartment(Department department);
}
