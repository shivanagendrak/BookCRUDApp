package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API")
public class BookController {
    @Autowired
    public BookServiceImpl bookServiceImpl;
    @GetMapping("/getBook/{Id}")
    public Book getBookById(@PathVariable("Id") Long Id){

        return bookServiceImpl.getBookById(Id);
    }
    @GetMapping
    public List<Book> getAllBook(){
        return bookServiceImpl.getAllBooks();

    }

    @PostMapping("/createBook" )
    public Book createBook(@RequestBody Book book){
        System.out.println("Im in create book");
        return bookServiceImpl.createBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return bookServiceImpl.updateBook(book);
    }

    @DeleteMapping("/{Id}")
    public String deleteBook(@PathVariable Long Id){
        bookServiceImpl.deleteBook(Id);
       return "Book Deleted Successfully";
    }

}
