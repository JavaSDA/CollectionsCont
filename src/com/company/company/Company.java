package com.company.company;

import java.util.List;

public class Company {

    // Define the attributes of the Company
    private List<Employee> employees;
    private String companyName;

    // Define the constructor
    public Company(List<Employee> employees, String companyName) {
        this.employees = employees;
        this.companyName = companyName;
    }

    // Define the getters and setters
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getAverageAge() {
        float sum = 0;

        for(Employee employee : this.employees) {
            sum += employee.getAge();
        }

        return sum / this.employees.size();
    }
}
