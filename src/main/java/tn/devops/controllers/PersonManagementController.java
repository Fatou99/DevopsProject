package tn.devops.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.devops.entities.Student;
import tn.devops.services.PersonManagement;

@RestController
@RequestMapping("/student")
public class PersonManagementController {

    @Autowired
    PersonManagement personManagement;

    // http://localhost:4200/Devops/student/getStudent/1
    @GetMapping("/getStudent/{student-id}")
    @ResponseBody
    public Student retrieveRayon(@PathVariable("student-id") int studentId) {
        return personManagement.findPersonById(studentId);
        //return "hello world";
    }


    // http://localhost:4200/Devops/student/addStudent
    @PostMapping("/addStudent")
    @ResponseBody
    public int addStudent(@RequestBody Student s) {
        return personManagement.addPerson(s);
    }
}
