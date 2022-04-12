package com.victor.Matricula.service;

import com.victor.Matricula.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    // vamos implementar o saveStudent no StudentServiceImple.

    @Autowired

    Student saveStudent(Student Student);


    List<Student> getAllStudents();


    Student updateStudent(Student student);


    void deleteById(Long id);
}
