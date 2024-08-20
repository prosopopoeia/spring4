package com.learnspring.demo.rest;

import com.learnspring.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // @PostConstruct is only called once, therefore...
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();


        theStudents.add(new Student("Kip", "Trimmle"));
        theStudents.add(new Student("Steve", "Tipps"));
        theStudents.add(new Student("Trish", "Rishel"));

    }

    //define "/students" endpoint (list of all students)

    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    @GetMapping('/students/{studentId}')
    public Student getStudent(@PathVariable int studentId) {
        return theStudents.get(studentId);
    }

}
