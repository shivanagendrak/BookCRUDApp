package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;


public interface BookService  {
    Book getBookById(Long id);
    List<Book> getAllBooks();
    Book createBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Long id);

}
