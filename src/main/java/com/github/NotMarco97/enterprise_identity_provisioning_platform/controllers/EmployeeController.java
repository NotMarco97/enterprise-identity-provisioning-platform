package com.github.NotMarco97.enterprise_identity_provisioning_platform.controllers;

import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.CreateEmployeeRequest;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.EmployeeResponse;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.UpdateEmployeeRequest;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.services.EmployeeServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeServiceImp employeeServiceImp;

    public EmployeeController(EmployeeServiceImp employeeServiceImp) {
        this.employeeServiceImp = employeeServiceImp;
    }

    @PostMapping()
    public EmployeeResponse createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest){
        return employeeServiceImp.createEmployee(createEmployeeRequest);
    }

    @GetMapping()
    public List<EmployeeResponse> getAllEmployees(){
        return employeeServiceImp.findAllEmployees();
    }

    @GetMapping("{employeeId}")
    public EmployeeResponse getEmployee(@PathVariable String employeeId){

        return employeeServiceImp.findByEmployeeId(employeeId);
    }

    @DeleteMapping("{employeeId}")
    public void deleteEmployee(@PathVariable String employeeId){
        employeeServiceImp.deleteByEmployeeId(employeeId);
    }

    @PatchMapping("{employeeId}")
    public EmployeeResponse updateEmployee(@PathVariable String employeeId, @RequestBody UpdateEmployeeRequest updateEmployeeRequest){
        return employeeServiceImp.updateEmployee(employeeId, updateEmployeeRequest);
    }

}
