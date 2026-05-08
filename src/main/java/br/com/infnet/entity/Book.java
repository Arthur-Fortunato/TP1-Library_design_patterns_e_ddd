package br.com.infnet.entity;

import br.com.infnet.interfaces.Item;

public class Book implements Item {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}