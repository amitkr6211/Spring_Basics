package com.sprinklr.springAPI.course;

import com.sprinklr.springAPI.student.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,Integer> {
    public List<Course> findByStudent(Student s);
}
