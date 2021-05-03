package com.saradha.departmentservice.controller;

import com.saradha.departmentservice.entity.Department;
import com.saradha.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentService.findAllDeparments();
    }


    @PostMapping("/")
    public Department saveDeparment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
        return departmentService.getDepartmentById(id);
    }
}
