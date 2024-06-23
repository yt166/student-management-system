package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    RestTemplate restTemplate;

    public StudentEntity createStudent(Student student){

        StudentEntity entity = mapper.convertValue(student, StudentEntity.class);
        return studentRepository.save(entity);

    }

    public List<Student> getStudent(){

        List<Student> dtos = new ArrayList<>();
        Iterable<StudentEntity> entities = studentRepository.findAll();
        Iterator<StudentEntity> iterator = entities.iterator();

        while (iterator.hasNext()){
            StudentEntity entity = iterator.next();
            Student student = mapper.convertValue(entity, Student.class);
            dtos.add(student);
        }

        return  dtos;
    }

    @Override
    public boolean removeStudent(Long studentId) {
//        System.out.println("ba ba");
//        studentRepository.deleteById(stu_id);
        Optional<StudentEntity> optionalStudent = studentRepository.findById(studentId);

        if(optionalStudent.isPresent()){
            optionalStudent.get();
            studentRepository.deleteById(studentId);
            return true;
        }

        return false;
    }

    public ResponseEntity<Map> getInformation(){

        ResponseEntity<Map> exchange = this.restTemplate.exchange("https://api.nationalize.io?name=nathaniel\n",
                HttpMethod.GET, null, Map.class);

        return exchange;
    }

}
