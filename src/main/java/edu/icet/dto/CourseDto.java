package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class CourseDto {
    private String courseID;
    private String courseName;
    private int duration;
}
