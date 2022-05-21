package com.example.springbootrestfulwebservices.web;

import com.example.springbootrestfulwebservices.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    //localhost:8080/student/ state the student. this method that we are going
    // to write will be used
    // we provide url path variables
    @GetMapping("/student/{firstName}/{lastName}") // we need to bind this first and last
    // to the methodes arguments
    public Student StudentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }
    // build rest Api to handle query parameters
    //hhttp://localhost:8080/student?firstname = yves. this is query parameter requests or  web request
    @GetMapping("/studentrequestparam")
    public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
                                     @RequestParam(name ="lastName") String lastName){
        return new Student(firstName,lastName);
    }

}
