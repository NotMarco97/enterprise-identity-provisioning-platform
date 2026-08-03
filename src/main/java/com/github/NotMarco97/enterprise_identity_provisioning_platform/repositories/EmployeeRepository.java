package com.github.NotMarco97.enterprise_identity_provisioning_platform.repositories;

import com.github.NotMarco97.enterprise_identity_provisioning_platform.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
