package br.com.infnet.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void loanBook(Book book, User user) {
        Loan loan = new Loan(book, user);
        loans.add(loan);
    }

    public void returnBook(Book book, User user) {
        loans.removeIf(loan -> loan.getBook().equals(book) && loan.getUser().equals(user));
    }
}