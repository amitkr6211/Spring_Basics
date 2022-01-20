package com.sprinklr.springAPI.course;

import com.sprinklr.springAPI.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/students/{studentID}/courses")
    public List<Course> getAllCourses(@PathVariable int studentID){
        return courseService.getAllCourses(studentID);
    }

    @GetMapping("/students/{studentID}/courses/{courseID}")
    public Optional<Course> getCourseWithID(@PathVariable int courseID){
        return courseService.getCourseWithID(courseID);
    }

    @PostMapping("/students/{studentID}/courses")
    public void addCourse(@PathVariable int studentID,@RequestBody Course course){
        Student s=new Student(studentID,"",0);
        course.setStudent(s);
        courseService.addCourse(course);
    }

    @DeleteMapping("/students/{id}/courses/{courseID}")
    public void removeCourse(@PathVariable int courseID){
        courseService.removeCourse(courseID);
    }

    @PutMapping("/students/{studentID}/courses/{courseID}")
    public void updateCourse(@RequestBody Course course, @PathVariable int courseID, @PathVariable int studentID){
        Student s=new Student(studentID,"",0);
        course.setStudent(s);
        courseService.updateCourse(course,courseID);
    }

}
