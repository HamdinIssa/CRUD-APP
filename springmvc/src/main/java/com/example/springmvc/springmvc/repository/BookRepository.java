package com.example.springmvc.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmvc.springmvc.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,String>{


}
