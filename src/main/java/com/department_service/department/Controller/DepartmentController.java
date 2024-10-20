package com.department_service.department.Controller;

import com.department_service.department.DTO.DepartmentDto;
import com.department_service.department.Entity.Department;
import com.department_service.department.Service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    public DepartmentController() {
    }
//build savedDepartment restAPi

    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto saveDepartment= departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }
    @GetMapping("/getDepartments/{Id}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable Long Id){
        DepartmentDto departmentDto= departmentService.getDepartments(Id);
        return new ResponseEntity<>(departmentDto,HttpStatus.OK);
    }
    @GetMapping("/getDepartment/{dcode}")
    public ResponseEntity<DepartmentDto> getbydepartmentcode(@PathVariable String dcode){

        DepartmentDto departmentDto= departmentService.getbydcode(dcode);
        return new ResponseEntity<>(departmentDto,HttpStatus.OK);
    }

    @GetMapping("/Paginateddepartment")
    public Page<Department> getPaginatedData(@RequestParam int page  ,@RequestParam int size){
        return departmentService.getpaginateddata(page,size);
    }
    @GetMapping("/deptWithPA/{approvalstatus}")
    public List<Department> getDepartmentWithPendingApproval(@PathVariable String approvalstatus ){
       List<Department> responseList= departmentService.getdeptWithPA(approvalstatus);
        if(responseList.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"no department found");

        }
        return responseList;
    }
}