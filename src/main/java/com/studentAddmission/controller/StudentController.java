package com.studentAddmission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentAddmission.entity.Student;
import com.studentAddmission.repository.StudentRepository;
import com.studentAddmission.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	
	    @Autowired
	    private StudentService studService;

	    @GetMapping("/get")
	    public List<Student> getAllStudents() {
	        return studService.getAllStudents();
	    }

	    @PostMapping("/student")
	    public Student createStudent(@RequestBody Student student) {
	        return studService.createStudent(student);
	    }

	   @GetMapping("/{id}")
	   public Student getStudentById(@PathVariable int id) {
		   return studService.getStudentsById(id);
	   }

	
}
	
