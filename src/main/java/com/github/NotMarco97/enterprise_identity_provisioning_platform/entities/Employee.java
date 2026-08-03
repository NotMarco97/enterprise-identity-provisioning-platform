package com.github.NotMarco97.enterprise_identity_provisioning_platform.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String firstName;
    private String lastName;
    private String status;
    private String department;
    private String jobTitle;
    private String email;
    private double salary;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Column(unique = true)
    private String employeeId;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
}
