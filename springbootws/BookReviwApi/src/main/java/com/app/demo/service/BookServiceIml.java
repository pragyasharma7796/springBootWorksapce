package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.app.demo.dao.BookDao;
import com.app.demo.dto.Book;
import com.app.demo.exceptioon.NoDataForGivenIdException;
import com.app.demo.responseStructure.ResponseStructure;

@Service
public class BookServiceIml  {
	@Autowired
	BookDao bdao;
	
	public Book save(Book book) {
		
		return bdao.saveBook(book);
	}

	
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bdao.getAll();
	}
	public Book updaete(Book book) {
		return bdao.upDateBook(book);
	}
	public ResponseStructure<Book> getId(int id) {
		// TODO Auto-generated method stub
		ResponseStructure<Book> rs = new ResponseStructure<Book>();
		Book b = bdao.getById(id);
		if(b!=null) {
			rs.setData(b);
			rs.setMessage("Book Data Found");
			rs.setStatusCode(HttpStatus.FOUND.value());
			return rs;
		}
		throw new NoDataForGivenIdException();
		
	}
	public Book deleteById(int id) {
		return bdao.deleteBookById(id);
	}

}
