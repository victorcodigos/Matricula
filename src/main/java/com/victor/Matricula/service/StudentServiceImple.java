package com.victor.Matricula.service;

import com.victor.Matricula.model.Student;
import com.victor.Matricula.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImple implements com.victor.Matricula.service.StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student Student) {
        return studentRepository.save(Student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public  Student updateStudent(Student student) {
         return studentRepository.save(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);

    }

}



