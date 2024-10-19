package com.department_service.department.DTO;





public class DepartmentDto {
    private long id;
    private String dname;
    private String description;
    private String departmentcode;

    public DepartmentDto(long id, String dname, String description, String departmentcode) {
        this.id = id;
        this.dname = dname;
        this.description = description;
        this.departmentcode = departmentcode;
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
}