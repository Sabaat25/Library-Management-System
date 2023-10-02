package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentTestSave {
	public static void main(String[] args) { 
		StudentService studentService = new StudentService();
		Student student = new Student();

		student.setSname("Sabaat");
		student.setEmail("sabaat06@mail.com"); 
		student.setPhone_no(8655090);

		studentService.saveStudentDetails(student);
	} 
}
