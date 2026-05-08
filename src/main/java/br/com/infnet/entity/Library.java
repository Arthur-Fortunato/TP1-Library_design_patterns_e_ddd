package br.com.infnet.entity;

import br.com.infnet.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library library;

    public List<Item> items = new ArrayList<>();
    public List<User> users = new ArrayList<>();
    public List<Loan> loans = new ArrayList<>();

    private Library() {}

    public static Library getLibrary() {
        if (library == null) {
            library = new Library();
        }
        return library;
    }
}