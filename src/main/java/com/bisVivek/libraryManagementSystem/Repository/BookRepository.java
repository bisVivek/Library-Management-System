package com.bisVivek.libraryManagementSystem.Repository;

import com.bisVivek.libraryManagementSystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
