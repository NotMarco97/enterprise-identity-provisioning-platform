package com.github.NotMarco97.enterprise_identity_provisioning_platform.services;

import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.CreateEmployeeRequest;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.EmployeeResponse;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.UpdateEmployeeRequest;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.entities.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest);
    EmployeeResponse findByEmployeeId(String EmployeeId);
    void deleteById(String employeeID);
    EmployeeResponse updateEmployee(String employeeId, UpdateEmployeeRequest updateEmployeeRequest);
    List<EmployeeResponse> findAll();
    Boolean existsByEmployeeId(String employeeID);
}
