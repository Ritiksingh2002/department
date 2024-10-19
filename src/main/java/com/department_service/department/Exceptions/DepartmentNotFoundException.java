package com.department_service.department.Exceptions;

public class DepartmentNotFoundException extends RuntimeException {
    public DepartmentNotFoundException(Long id){
        super("departmentNot dounf wiht id  "+id);
    }
}
