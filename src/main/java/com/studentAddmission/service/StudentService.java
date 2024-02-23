package com.studentAddmission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentAddmission.entity.Student;
import com.studentAddmission.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> getAllStudents(){
		return studRepo.findAll();
	}
	
	public Student getStudentsById(int id) {
		return studRepo.findById(id).orElseThrow();
	}
	
	public Student createStudent(Student student) {
		return studRepo.save(student);
	}
}
