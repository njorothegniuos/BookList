package com.MBASE.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/booklist")
public class BookList {
	
	@RequestMapping("/")
	public String Home() {
		return "Welcome to book hub.............................................";		
	}
	
	

}
