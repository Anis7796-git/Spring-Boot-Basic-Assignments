package com.anhee.main;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anhee.sbean.Student;
import com.anhee.sbean.StudentService;

@SpringBootApplication
@ComponentScan(basePackages = "com.anhee")
public class StudentResultManagementSystem1Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(StudentResultManagementSystem1Application.class, args);
		
		Scanner scanner=  new Scanner(System.in);
	
		Student student= new Student();
		student.setId("A101");
		student.setMarks(40);
		student.setName("Anis");
		
		
		StudentService bean = run.getBean(StudentService.class);
		bean.addStudentResult(student);
		
		System.out.println(student);
		
	
		scanner.close();
	}

}
