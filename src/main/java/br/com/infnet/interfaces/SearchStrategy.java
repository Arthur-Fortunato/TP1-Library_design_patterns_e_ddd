package br.com.infnet.interfaces;

import java.util.List;

public interface SearchStrategy {
    Item search(List<Item> items, String title);
}
