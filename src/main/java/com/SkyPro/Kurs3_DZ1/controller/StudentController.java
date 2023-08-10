package com.SkyPro.Kurs3_DZ1.controller;

import com.SkyPro.Kurs3_DZ1.model.Student;
import com.SkyPro.Kurs3_DZ1.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;
@GetMapping
    public Collection <Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student getById (@PathVariable("id") Long id){
    return studentService.getById(id);
    }

    @PostMapping
    public  Student create(@RequestBody Student student){
        return studentService.create(student);
    }
    @PutMapping("/{id}")
    public Student update (@PathVariable("id") Long id,@RequestBody Student student){
        return studentService.update(id, student);
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable("id") Long id){
    studentService.delete(id);
    }
}
