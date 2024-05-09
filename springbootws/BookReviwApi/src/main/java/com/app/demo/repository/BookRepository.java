package com.app.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.dto.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	List<Book> findByRating(double rating);

}
