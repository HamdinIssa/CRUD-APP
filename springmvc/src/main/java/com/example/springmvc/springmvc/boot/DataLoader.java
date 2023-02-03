package com.example.springmvc.springmvc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springmvc.springmvc.model.Book;
import com.example.springmvc.springmvc.repository.BookRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private BookRepository bookRepository;

    @Autowired
    public void bookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book book1 = new Book();

        book1.setName("Homer Price");
        book1.setAuthor("Robert McCloskey");
        book1.setPublishYear("2000");
        book1.setPrice(5.99);

        bookRepository.save(book1);

        Book book2 = new Book();

        book2.setName("A briefer history of time");
        book2.setAuthor("Stephen Hawking");
        book2.setPublishYear("2006");
        book2.setPrice(22.0);

        bookRepository.save(book2);

    }

}
