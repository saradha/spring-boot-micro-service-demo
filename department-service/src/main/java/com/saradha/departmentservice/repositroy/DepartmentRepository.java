package com.saradha.departmentservice.repositroy;

import com.saradha.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findBydepartmentId(Long id);
}
