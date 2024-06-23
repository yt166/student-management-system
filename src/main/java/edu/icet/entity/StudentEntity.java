package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long stu_id;
    private String first_Name;
    private String last_Name;
    private String contact;

}
