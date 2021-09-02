package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.respository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*studentRepository.save(new Student("Student 1", "Last name 1", "email@mgila.com"));
		studentRepository.save(new Student("Student 2", "Last name 2", "email1@mgila.com"));
		studentRepository.save(new Student("Student 3", "Last name 3", "email2@mgila.com"));
		studentRepository.save(new Student("Student 4", "Last name 4", "email3@mgila.com"));
		studentRepository.save(new Student("Student 5", "Last name 5", "email4@mgila.com"));
		*/
	}

}
