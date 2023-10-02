package com.jsp.controller;

import com.jsp.service.BookService;

public class BookTestUpdate { 
	public static void main(String[] args) {
		BookService bookService=new BookService(); 
		bookService.updateBookById(1, "End With Us","Collen Hoover");
	}

}
