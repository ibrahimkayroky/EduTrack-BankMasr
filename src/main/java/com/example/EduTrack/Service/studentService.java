package com.example.EduTrack.Service;

import com.example.EduTrack.Entity.Student;

import java.util.List;

public interface studentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
    void deleteStudent(Long id);

}
