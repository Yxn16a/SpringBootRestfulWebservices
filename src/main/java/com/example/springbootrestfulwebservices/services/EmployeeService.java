package com.example.springbootrestfulwebservices.services;

import com.example.springbootrestfulwebservices.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee savaEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
    Employee updateEmployee(Employee employee, Long id);
}
