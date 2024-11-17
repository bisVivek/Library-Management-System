package com.bisVivek.libraryManagementSystem.Controller;

import com.bisVivek.libraryManagementSystem.Entity.Book;
import com.bisVivek.libraryManagementSystem.Service.BookService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}
