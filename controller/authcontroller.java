package com.edutrack.controller;

import com.edutrack.model.Teacher;
import com.edutrack.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private TeacherRepository teacherRepository;

    @PostMapping("/login")
    public String login(@RequestBody Teacher teacher){
        Teacher t = teacherRepository.findByUsernameAndPassword(
                teacher.getUsername(), teacher.getPassword());
        if(t != null) return "Login successful";
        else return "Invalid credentials";
    }
}
