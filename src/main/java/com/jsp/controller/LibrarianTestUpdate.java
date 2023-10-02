package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class LibrarianTestUpdate { 
	public static void main(String[] args) {
		LibrarianService librarianService =new LibrarianService();
		librarianService.updateLibrarianById(1, "vishu", "vishu25S@mail.com");
	}
}
