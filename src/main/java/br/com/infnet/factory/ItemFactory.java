package br.com.infnet.factory;

import br.com.infnet.entity.Book;
import br.com.infnet.interfaces.Item;

public class ItemFactory {
    public static Item create(String type, String title) {
        if (type.equals("book")) {
            return new Book(title);
        }
        return null;
    }
}