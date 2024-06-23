package edu.icet.repository.impl;

import edu.icet.repository.StudentNativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;

@Repository
public class StudentNativeRepositoryImpl implements StudentNativeRepository {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public boolean removeStudent(Long studentId) {

         return namedParameterJdbcTemplate.update("DELETE FROM student WHERE ID=:id",
                 Collections.singletonMap("id",studentId))>0;
    }
}
