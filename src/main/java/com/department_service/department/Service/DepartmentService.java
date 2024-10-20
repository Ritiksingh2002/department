package com.department_service.department.Service;

import com.department_service.department.DTO.DepartmentDto;
import com.department_service.department.Entity.Department;
import com.department_service.department.Exceptions.DepartmentNotFoundException;
import com.department_service.department.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentService() {
    }

    public DepartmentDto saveDepartment(DepartmentDto departmentDto){
        //convert dto to entity
        Department department= new Department( departmentDto.getId(),departmentDto.getDescription(), departmentDto.getDname(),
                departmentDto.getDepartmentcode());

        Department savedDEpartment=departmentRepository.save(department);
        //convert entity to dto because dto is returned
        DepartmentDto savedDepartmentDTo= new DepartmentDto(savedDEpartment.getId(),savedDEpartment.getDname(),savedDEpartment.getDescription(),savedDEpartment.getDepartmentcode());
        return savedDepartmentDTo;
    }

    public DepartmentDto getDepartments(Long id) {
        Department savedDEpartment= departmentRepository.findById(id).orElseThrow(()->
                new DepartmentNotFoundException(id)
        );

        DepartmentDto savedDepartmentDTo= new DepartmentDto(savedDEpartment.getId(),savedDEpartment.getDname(),savedDEpartment.getDescription(),savedDEpartment.getDepartmentcode());
        return savedDepartmentDTo;

    }

    public DepartmentDto getbydcode(String dcode) {

        Department dbycode=departmentRepository.findByDepartmentcode(dcode);
        DepartmentDto dBycode=new DepartmentDto(dbycode.getId(),dbycode.getDname(),dbycode.getDescription(),dbycode.getDepartmentcode());
        return dBycode;
    }

    public Page<Department> getpaginateddata(int page, int size) {
        return departmentRepository.findAll(PageRequest.of(page, size));
    }


    public List<Department> getdeptWithPA(String approvalstatus) {
        return departmentRepository.finddepartmentbyapprovalstatus(approvalstatus);
    }
}
