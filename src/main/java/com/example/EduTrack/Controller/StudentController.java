package com.example.EduTrack.Controller;


import com.example.EduTrack.Entity.Student;
import com.example.EduTrack.Service.studentService;
import com.example.EduTrack.Service.studentServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private studentService sService;

    @GetMapping
    public List<Student> getAllStudents()
    {
        return sService.getAllStudents();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return sService.saveStudent(student);
    }
    
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id)
    {
        sService.deleteStudent(id);
    }

}
