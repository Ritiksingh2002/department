package com.department_service.department.repository;

import com.department_service.department.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentcode(String dcode);


}