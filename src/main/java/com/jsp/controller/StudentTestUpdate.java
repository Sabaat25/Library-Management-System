package com.jsp.controller;

import com.jsp.service.StudentService;

public class StudentTestUpdate {  
	public static void main(String[] args) {
	StudentService studentService=new StudentService();  
	studentService.updateStudentDetailsById(1, "Sabaat", "sabaat06@mail.com", 89906456);
	}
}
