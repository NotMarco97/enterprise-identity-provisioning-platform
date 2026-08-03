package com.github.NotMarco97.enterprise_identity_provisioning_platform.services;

import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.CreateEmployeeRequest;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.EmployeeResponse;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.dto.UpdateEmployeeRequest;
import com.github.NotMarco97.enterprise_identity_provisioning_platform.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        return null;
    }

    @Override
    public EmployeeResponse findByEmployeeId(String EmployeeId) {
        return null;
    }

    @Override
    public void deleteById(String employeeID) {

    }

    @Override
    public EmployeeResponse updateEmployee(String employeeId, UpdateEmployeeRequest updateEmployeeRequest) {
        return null;
    }

    public List<EmployeeResponse> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Boolean existsByEmployeeId(String employeeID) {
        return null;
    }



}
