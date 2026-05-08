package br.com.infnet.strategy;

import br.com.infnet.interfaces.Item;
import br.com.infnet.interfaces.SearchStrategy;

import java.util.List;

public class TitleSearchStrategy implements SearchStrategy {
    public Item search(List<Item> items, String title) {
        for (Item item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }
}