package com.department_service.department.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String dname;
    private String description;
    private String departmentcode;
    public Department(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }



    public Department(long id, String description, String dname, String departmentcode) {
        this.dname = dname;
        this.description = description;
        this.departmentcode = departmentcode;
    }
}