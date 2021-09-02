package com.example.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sms.entity.Student;
import com.example.sms.respository.StudentRepository;
import com.example.sms.services.StudentService;

@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService studentService) {
		super();
		this.service = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", service.GetAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		service.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", service.getStudentById(id));
		return "edit_student";
	}
	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, 
			@ModelAttribute("student") Student student,
			Model model) {
		
		Student s = service.getStudentById(id);
		s.setId(student.getId());
		s.setFirstName(student.getFirstName());
		s.setLastName(student.getLastName());
		s.setEmail(student.getEmail());
		
		service.updateStudent(s);
		return "redirect:/students";
	}
		
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudentById(id);
		return "redirect:/students";
	}
	
}
