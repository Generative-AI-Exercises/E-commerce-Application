package com.epam.task1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.task1.entities.Author;
import com.epam.task1.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{}

