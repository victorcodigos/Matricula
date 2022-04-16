package com.victor.Matricula.model;
// Dentro do pacote model: Entidade, getter e setter, construcao.

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private char gender;
    private String email;
    private String typeCourse;
    private float familyIncome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCourse() {
        return typeCourse;
    }

    public void setTypeCourse(String typeCourse) {
        this.typeCourse = typeCourse;
    }

    public float getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(float familyIncome) {
        this.familyIncome = familyIncome;
    }

    public Student() {


    }


}
