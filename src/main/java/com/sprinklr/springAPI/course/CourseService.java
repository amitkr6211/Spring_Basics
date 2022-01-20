package com.sprinklr.springAPI.course;

import com.sprinklr.springAPI.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(int studentID) {
        //return all the courses with particular studentId
        Student s=new Student(studentID,"",0);
        return  courseRepository.findByStudent(s);
    }

    public Optional<Course> getCourseWithID(int courseID) {
        return courseRepository.findById(courseID);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course, int courseID) {
        courseRepository.save(course);
    }

    public void removeCourse(int courseID) {
        courseRepository.deleteById(courseID);
    }
}
