package com.example.springbootrestfulwebservices.repository;

import com.example.springbootrestfulwebservices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
