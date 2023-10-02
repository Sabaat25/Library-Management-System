package com.jsp.controller;

import com.jsp.service.AdminService;

public class Login {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		boolean res=adminService.login(1, "sabaat", "sabaat06");
		System.out.println(res);
	}

}
