package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.dto.Book;
import com.app.demo.service.BookServiceIml;

@RestController
public class BookController {
	@Autowired
	BookServiceIml bs;
		@PostMapping("/book")
		public Book save(@RequestBody Book b) {
			return bs.save(b);
		}
		@GetMapping("/book")
		public List<Book> getData() {
			return bs.getAll();
		}
		@PutMapping("/book")
		public Book updateBook(Book book) {
			return bs.updaete(book);
		}
		
		@GetMapping("/book/{id}")
		public Book getDataById(@PathVariable("id") int id) {
			Book b=bs.getId(id).getData();
			return b;
		} 
}

