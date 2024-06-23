package edu.icet.controller;

import edu.icet.dto.CourseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @PostMapping("/createCourse")
    public void createCourse(@RequestBody CourseDto courseDto){
        System.out.println(courseDto);
    }
}
