package edu.icet.controller;
import edu.icet.common.AuditTime;
import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@Slf4j

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public StudentEntity addStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PatchMapping("/student")
    public StudentEntity updateStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/getStudent")
    @AuditTime
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @DeleteMapping("/remove/{studentID}")
     public Map removeStudent(@PathVariable Long studentID){
        System.out.println("ya ya");

        boolean isRemoved = studentService.removeStudent(studentID);
        if(isRemoved){
            return Collections.singletonMap("status","remove Student");
        }else {
            return Collections.singletonMap("status","failed");
//            return Collections.singletonMap("status", String.format("Student id (%s) invalid",studentID));
        }
    }

    @GetMapping("/get-information")
    ResponseEntity<Map> getInformation(){
        return studentService.getInformation();
    }
}
