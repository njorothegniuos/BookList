package com.MBASE.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.MBASE.model.Book;

@Service
public class BookService {
	Hashtable<String, Book> booklist = new Hashtable<String, Book>();
	public BookService() {
		Book bk = new Book();
		bk.setBookName("Kifo Kisimani");
		bk.setAuthor("Paul Mwangi");
		bk.setYear(2019);
		booklist.put("1", bk);
		
		bk.setBookName("The river");
		bk.setAuthor("Lisa Mwangi");
		bk.setYear(2019);
		booklist.put("2", bk);
		
		bk.setBookName("The enemy");
		bk.setAuthor("Paul K.");
		bk.setYear(2019);
		booklist.put("3", bk);
		
		bk.setBookName("The city");
		bk.setAuthor("Joel Kinuthia");
		bk.setYear(2019);
		booklist.put("4", bk);
	}
	public Hashtable<String, Book> getAll(){
		return booklist;
	}

}
