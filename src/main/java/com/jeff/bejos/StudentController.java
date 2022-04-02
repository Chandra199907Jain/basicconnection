package com.jeff.bejos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public String listAll(Model model) {
        List<Student> listStudents = studentRepository.findAll();
        model.addAttribute("listStudents", listStudents);

        return "students";
    }

}
