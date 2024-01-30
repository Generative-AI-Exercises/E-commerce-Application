package com.epam.task1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.task1.entities.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long>{

}
