package br.com.infnet.entity;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private User user;
    private LocalDate dueDate;

    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.dueDate = LocalDate.now().plusDays(7);
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }
}
