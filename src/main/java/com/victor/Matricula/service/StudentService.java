package com.victor.Matricula.service;

import com.victor.Matricula.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    // vamos implementar o saveStudent no StudentServiceImple.


    Student saveStudent(Student Student);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteById(Integer id);

    Optional<Student> findById(Integer id);
}
