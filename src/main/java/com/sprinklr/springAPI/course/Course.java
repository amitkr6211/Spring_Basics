package com.sprinklr.springAPI.course;

import com.sprinklr.springAPI.student.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private int id;
    private String name;
    @ManyToOne
    private Student student;

    public Course() {
    }

    public Course(int id, String name, int studentId) {
        this.name = name;
        this.id = id;
        this.student=new Student(studentId,"",0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
