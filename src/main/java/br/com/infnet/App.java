package br.com.infnet;

import br.com.infnet.facade.LibraryFacade;

public class App {
    public static void main(String[] args) {
        LibraryFacade facade = new LibraryFacade();
        facade.addItem("book", "Harry Potter");
        facade.addUser("Arthur");
        facade.loanItem("Harry Potter", "Arthur");
        facade.checkLoans();
    }
}