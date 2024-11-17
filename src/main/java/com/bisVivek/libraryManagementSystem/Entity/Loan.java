package com.bisVivek.libraryManagementSystem.Entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.time.LocalDate;

@Entity
public class Loan {
    //id, user_id, book_id, loan_date, return_date, fine
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name ="user_id", nullable = false)
    private User user;

    private Book book;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private Double fine;

    public Loan(Long id, User user, Book book, LocalDate loanDate, LocalDate returnDate, Double fine) {
        this.id = id;

        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }
}
