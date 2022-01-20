package com.sprinklr.springAPI.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    List<Student> list= new ArrayList<>(Arrays.asList(
//            new Student(1,"Amit",20),
//            new Student(2,"Ashu",21),
//            new Student(3,"Aman",22),
//            new Student(4,"Sumit",20)
//    ));

    public List<Student> getAllStudents() {
        List<Student> list=new ArrayList<>();
        studentRepository.findAll().forEach(list::add);
        return list;
    }

    public Optional<Student> getStudentWithID(int id) {
//        Student s=list.stream().filter(t->t.getId()==id).findFirst().get();
//        return s;
        return studentRepository.findById(id);
    }

    public void addStudent(Student student) {
//        list.add(student);
        studentRepository.save(student);
    }

    public void removeStudent(int id) {
//        Student s=list.stream().filter(t->t.getId()==id).findFirst().get();
//        list.remove(s);
        studentRepository.deleteById(id);
    }

    public void updateStudent(Student s,int id) {
//        for(int i=0;i<list.size();i++){
//            Student obj=list.get(i);
//            if(obj.getId()==id){
//                list.set(i,s);
//                return;
//            }
//        }
        System.out.println("HERE  "+id);
        studentRepository.save(s);
    }
}
