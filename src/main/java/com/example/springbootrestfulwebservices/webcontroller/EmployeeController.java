package com.example.springbootrestfulwebservices.webcontroller;

import com.example.springbootrestfulwebservices.model.Employee;
import com.example.springbootrestfulwebservices.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
       return new ResponseEntity<Employee>(employeeService.savaEmployee(employee), HttpStatus.CREATED) ;
    }
    // get all employees
    @GetMapping("/findall")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }
    // find employee by id
    @GetMapping("/find/{id}")
    public  ResponseEntity<Employee> findEmployeeById(@PathVariable Long id){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(id),HttpStatus.OK);
    }
    // delete employee by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){
         employeeService.deleteEmployeeById(id);
         return new ResponseEntity<String>("Employee deleted successfully",HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    // ResponseEntity help with adding a body
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id,
                                                   @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
    }

}
