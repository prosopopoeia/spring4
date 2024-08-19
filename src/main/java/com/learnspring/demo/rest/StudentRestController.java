package com.learnspring.demo.rest;

import com.learnspring.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    //define "/students" endpoint (list of all students)

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();


        theStudents.add(new Student("Kip", "Trimmle"));
        theStudents.add(new Student("Steve", "Tipps"));
        theStudents.add(new Student("Trish", "Rishel"));

        return theStudents;
    }

}
