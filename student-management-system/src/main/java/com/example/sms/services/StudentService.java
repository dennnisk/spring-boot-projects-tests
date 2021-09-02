package com.example.sms.services;

import java.util.List;

import com.example.sms.entity.Student;

public interface StudentService {
	List<Student> GetAllStudents();

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
