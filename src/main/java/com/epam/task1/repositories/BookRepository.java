package com.epam.task1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.task1.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{
	
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthor_NameContainingIgnoreCase(String authorName);
    List<Book> findByGenre_NameContainingIgnoreCase(String genreName);
}
