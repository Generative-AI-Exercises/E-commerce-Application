package com.epam.task1.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epam.task1.exceptions.ResourceNotFoundException;
import com.epam.task1.repositories.BookRepository;
import com.epam.task1.services.BookService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

	private final BookRepository bookRepository;
	
    // methods for adding, removing, updating and fetching books

}
