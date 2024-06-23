package edu.icet.service;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public StudentEntity createStudent(Student student);

    List<Student> getStudent();

     boolean removeStudent(Long studentId);

    ResponseEntity<Map> getInformation();
}
