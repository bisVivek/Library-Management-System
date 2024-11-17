package com.bisVivek.libraryManagementSystem.Service;

import com.bisVivek.libraryManagementSystem.Entity.Book;
import com.bisVivek.libraryManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
     private BookRepository bookRepository;

    private List<String > Book=new ArrayList<>();

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
