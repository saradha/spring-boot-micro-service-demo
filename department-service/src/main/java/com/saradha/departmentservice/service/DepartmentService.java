package com.saradha.departmentservice.service;

import com.saradha.departmentservice.entity.Department;
import com.saradha.departmentservice.repositroy.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> findAllDeparments() {
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long deptId) {
        log.info("Inside get department by id");
        return departmentRepository.findBydepartmentId(deptId);
    }
}
