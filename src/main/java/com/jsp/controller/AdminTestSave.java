package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;


public class AdminTestSave { 
	public static void main(String[] args) {  
		Admin admin=new Admin(); 
		admin.setUsername("sabaat"); 
		admin.setPassword("sabaat06"); 
		
		AdminService adminService=new AdminService();
		adminService.saveAdminDetails(admin);			
} 
}