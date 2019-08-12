package com.MBASE.controller;


import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MBASE.model.Book;
import com.MBASE.service.BookService;

@RestController
public class BookList {
	@Autowired
	public BookService bookService;
	
	@RequestMapping("/")
	public String Home() {
		return "Welcome to book hub.............................................";		
	}
	@RequestMapping("/api/booklist/getAll")
	public Hashtable<String, Book>getAll(){
		return bookService.getAll();
	}
	
	

}
