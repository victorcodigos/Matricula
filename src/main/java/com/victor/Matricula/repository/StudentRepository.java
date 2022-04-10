package com.victor.Matricula.repository;
// Dentro do pacote repositorio; JPA imple.

import com.victor.Matricula.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

// <Student, Interger> estao dizendo que a chave primaria tem um id.

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
