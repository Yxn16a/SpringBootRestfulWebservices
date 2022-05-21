package com.example.springbootrestfulwebservices.web;

import com.example.springbootrestfulwebservices.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // mvc uses converters object to jsons and verse
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Yves","Ngenzi");
    }
    @GetMapping("/students-list")
    public List<Student> getStudentList(){
        List<Student> students= new ArrayList<>();
        students.add(new Student("Yves","Ngenzi"));
        students.add(new Student("Manzi","Yvos"));
        students.add(new Student("Edward","Kamuhanda"));

        return students;
    }
}
