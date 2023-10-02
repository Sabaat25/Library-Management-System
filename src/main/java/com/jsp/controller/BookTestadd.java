package com.jsp.controller;

import com.jsp.dto.Book;
import com.jsp.service.BookService;
import com.jsp.service.LibrarianService;

public class BookTestadd { 
	public static void main(String[] args) { 
			Book book=new Book(); 
			book.setBook_name("It End with Us"); 
			book.setAuthor_name("Collen Hoover");  
			book.setStatus("Available");
			
			LibrarianService librarianService=new LibrarianService(); 
			librarianService.saveBook(book, 1);
	}
	}
