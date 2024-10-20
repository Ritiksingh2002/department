package com.department_service.department.repository;

import com.department_service.department.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentcode(String dcode);

    @Query("select d from Department d where d.dname = :approvalstatus")
    List<Department>finddepartmentbyapprovalstatus(@Param("approvalstatus")String approvalstatus);


}