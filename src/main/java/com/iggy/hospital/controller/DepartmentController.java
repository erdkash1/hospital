package com.iggy.hospital.controller;

import com.iggy.hospital.entity.Department;
import com.iggy.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/departments")
@RestController

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAll(){ return departmentService.getAllDepartments();}

    @GetMapping("/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id){ return departmentService.getDepartmentById(id);}

    @PostMapping
    public Department createDepartment(@RequestBody Department department){ return departmentService.saveDepartment(department);}

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ departmentService.deleteDepartment(id);}


}
