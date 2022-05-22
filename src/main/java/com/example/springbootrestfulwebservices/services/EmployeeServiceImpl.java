package com.example.springbootrestfulwebservices.services;

import com.example.springbootrestfulwebservices.exception.ResourceNotFoundException;
import com.example.springbootrestfulwebservices.model.Employee;
import com.example.springbootrestfulwebservices.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
// spring provide
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee savaEmployee(Employee employee) {
        return  employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return  employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee>  employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        } else{
          throw new ResourceNotFoundException("Employee", "id", id);
        }
    }


    @Override
    public void deleteEmployeeById(Long id) {
     employeeRepository.findById(id).orElseThrow(()->
             new ResourceNotFoundException("Employee","Id",id));
     employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Employee","id",id));
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        employeeRepository.save(existingEmployee);
        return existingEmployee;
    }

}
