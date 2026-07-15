package com.github.NotMarco97.enterprise_identity_provisioning_platform.dto;

public class UpdateEmployeeRequest {
    private String department;
    private String jobTitle;
    private String salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
}
