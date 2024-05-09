package com.app.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.demo.dto.Book;
import com.app.demo.repository.BookRepository;

@Repository
public class BookDao {
	@Autowired
	BookRepository repository;
	public Book saveBook(Book book) {
		System.out.println(book);
		return repository.save(book);
	}
	public Book upDateBook(Book book) {
		return repository.save(book);
	}
	public Book getById(int id) {
		Optional<Book> optional=repository.findById(id);
		if(optional.isPresent())
		return optional.get();
		return null;
	}
	public List<Book> getAll() {
		List<Book> lb=repository.findAll();
		System.out.println(lb);
		return lb;
	}
	public List<Book> getByRatings(double ratings) {
		return repository.findByRating(ratings);
	}
	public Book deleteBookById(int id) {
		Book b=getById(id);
		if(b!=null) {
		repository.delete(b);
		
		}
		return b;
	}
}
