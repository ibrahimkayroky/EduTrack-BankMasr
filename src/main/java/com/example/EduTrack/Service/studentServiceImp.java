package com.example.EduTrack.Service;

import com.example.EduTrack.DAO.studentRepository;
import com.example.EduTrack.Entity.Student;

import java.util.List;

public class studentServiceImp implements studentService{

    private studentRepository sRepository;

    @Override
    public List<Student> getAllStudents() {
        return sRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return (Student) sRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        sRepository.deleteById(id);
    }
}
